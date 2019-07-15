package org.danielbyun.spring5recipeapp.util;

import lombok.Synchronized;
import org.danielbyun.spring5recipeapp.command.NoteCommand;
import org.danielbyun.spring5recipeapp.model.Notes;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NoteCommandToNotes implements Converter<NoteCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NoteCommand source) {
        if(source == null) {
            return null;
        }

        final Notes notes = new Notes();
        notes.setId(source.getId());
        notes.setRecipeNotes(source.getRecipeNotes());
        return notes;
    }
}
