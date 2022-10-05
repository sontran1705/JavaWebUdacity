package com.udacity.jwdnd.course1.cloudstorage.entity;

public class Notes {

    private int noteId;

    private String noteDescription;

    private String noteTitle;

    private int userId;

    public Notes() {

    }

    public Notes(int noteId, String noteDescription, String noteTitle, int userId) {
        this.noteId = noteId;
        this.noteDescription = noteDescription;
        this.noteTitle = noteTitle;
        this.userId = userId;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

