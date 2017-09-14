package com.boot.noteapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.noteapi.dao.NoteDao;
import com.boot.noteapi.model.Note;

@Service
public class NoteService {

	@Autowired
	NoteDao noteDao;
		public Note findNote(String noteID) {
		Note note = noteDao.findOne(noteID);
		System.out.println("In Note service : find  method");
		return note;
	}

	public void insertNote(Note note) {
		System.out.println("In Note service : insert method");
		noteDao.save(note);
		
	}

	public void deleteNote(String noteID) {
		System.out.println("In Note service : delete method");
		Note note = findNote(noteID);
		noteDao.delete(note);
	}

	public List<Note> findAllNote() {
		List<Note> list= new ArrayList<Note>();
		noteDao.findAll().forEach(list::add);
		return list;
	}






}
