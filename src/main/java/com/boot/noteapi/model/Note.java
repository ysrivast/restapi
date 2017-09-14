package com.boot.noteapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Note {
	@Id
	private String noteID;
	private String noteTitle;
	private String noteDescription;

	public Note() {

	}

	public Note(String noteID, String noteTitle, String noteDescription) {

		this.noteID = noteID;
		this.noteTitle = noteTitle;
		this.noteDescription = noteDescription;
	}

	public String getNoteID() {
		return noteID;
	}

	public void setNoteID(String noteID) {
		this.noteID = noteID;
	}

	public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	public String getNoteDescription() {
		return noteDescription;
	}

	public void setNoteDescription(String noteDescription) {
		this.noteDescription = noteDescription;
	}

}
