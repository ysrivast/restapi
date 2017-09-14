package com.boot.noteapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.noteapi.model.Note;
import com.boot.noteapi.service.NoteService;

@RestController
public class NoteController {
	@Autowired
	NoteService noteService; 
	
/*	@RequestMapping(value="/")
	public String welcomeUser(){
		return "Hello Note Controller!";
	}*/
	@RequestMapping(value="/notes/{noteID}", method=RequestMethod.GET)
	public Note getNote(@PathVariable String noteID){
		return noteService.findNote(noteID);
	}
	
	@RequestMapping(value="/notes}", method=RequestMethod.GET)
	public List<Note> getAllNote(){
		return noteService.findAllNote();
	}
	
	@RequestMapping(value="/notes", method=RequestMethod.POST)
	public Note postNote(@RequestBody Note note){
		System.out.println("In note controller");
		 noteService.insertNote(note);
		 return noteService.findNote(note.getNoteID());
	}
	@RequestMapping(value="/notes/{noteID}", method=RequestMethod.DELETE)
	public void removeNote(@PathVariable String noteID){
		System.out.println("In note controller");
		 noteService.deleteNote(noteID);
	}

	
}
