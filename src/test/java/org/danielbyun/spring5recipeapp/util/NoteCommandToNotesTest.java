package org.danielbyun.spring5recipeapp.util;

import org.danielbyun.spring5recipeapp.command.NoteCommand;
import org.danielbyun.spring5recipeapp.model.Notes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoteCommandToNotesTest {

    public static final Long ID_VALUE = new Long(1L);
    public static final String RECIPE_NOTES = "Notes";
    NoteCommandToNotes converter;

    @BeforeEach
    public void setUp() throws Exception {
        converter = new NoteCommandToNotes();
    }

    @Test
    public void testNullParameter() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new NoteCommand()));
    }

    @Test
    public void convert() throws Exception {
        //given
        NoteCommand NoteCommand = new NoteCommand();
        NoteCommand.setId(ID_VALUE);
        NoteCommand.setRecipeNotes(RECIPE_NOTES);

        //when
        Notes notes = converter.convert(NoteCommand);

        //then
        assertNotNull(notes);
        assertEquals(ID_VALUE, notes.getId());
        assertEquals(RECIPE_NOTES, notes.getRecipeNotes());
    }
}