package com.boot.noteapi.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.noteapi.model.Note;

@Repository
public interface NoteDao extends CrudRepository<Note, String>{


}
