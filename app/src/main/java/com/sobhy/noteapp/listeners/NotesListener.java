package com.sobhy.noteapp.listeners;

import com.sobhy.noteapp.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note , int position);
}
