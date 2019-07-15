package org.danielbyun.spring5recipeapp.util;

import org.danielbyun.spring5recipeapp.command.NoteCommand;
import org.danielbyun.spring5recipeapp.model.Notes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotesToNoteCommandTest {
    public static final Long ID_VALUE = new Long(1L);
    public static final String RECIPE_NOTES = "Notes";
    NotesToNoteCommand converter;

    @BeforeEach
    public void setUp() throws Exception {
        converter = new NotesToNoteCommand();
    }

    @Test
    public void convert() throws Exception {
        //given
        Notes notes = new Notes();
        notes.setId(ID_VALUE);
        notes.setRecipeNotes(RECIPE_NOTES);

        //when
        NoteCommand NoteCommand = converter.convert(notes);

        //then
        assertEquals(ID_VALUE, NoteCommand.getId());
        assertEquals(RECIPE_NOTES, NoteCommand.getRecipeNotes());
    }

    @Test
    public void testNull() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(converter.convert(new Notes()));
    }
}