package org.danielbyun.spring5recipeapp.util;

import lombok.Synchronized;
import org.danielbyun.spring5recipeapp.command.NoteCommand;
import org.danielbyun.spring5recipeapp.model.Notes;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NotesToNoteCommand implements Converter<Notes, NoteCommand> {

    @Synchronized
    @Nullable
    @Override
    public NoteCommand convert(Notes source) {
        if (source == null) {
            return null;
        }

        final NoteCommand NoteCommand = new NoteCommand();
        NoteCommand.setId(source.getId());
        NoteCommand.setRecipeNotes(source.getRecipeNotes());
        return NoteCommand;
    }
}