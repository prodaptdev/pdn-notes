package com.pro.app.service;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pro.app.exception.NoteNotFoundException;
import com.pro.app.model.dto.ApiResponse;
import com.pro.app.model.prodapt.Notes;
import com.pro.app.repository.NotesRepository;

@Service
public class NoteService {
	
	@Autowired
	NotesRepository notesRepo;
	
	private static final Logger log = LogManager.getLogger(NoteService.class.getName());
	
	public List<Notes> getAllNotesFromRepo() {
		log.info("calling note repo for all notes");
		
		return notesRepo.findAll();
	}

	public Notes getNotesByIdFromRepo(Integer noteId) {
		log.info("calling note repo for note "+noteId);
		
		return notesRepo.findById(noteId).orElseThrow(()->new NoteNotFoundException(noteId));
	}

	public ResponseEntity<ApiResponse> saveNotesInRepo(List<Notes> notes) {
		
		log.info("calling note repo for saving the note details");
		
		notesRepo.saveAll(notes);		
		
		return new ResponseEntity<>(new ApiResponse("Successfully created/updated the note",new Date(),HttpStatus.CREATED), HttpStatus.CREATED);
	}

	public ResponseEntity<ApiResponse> deleteNoteByIdFromRepo(Integer id) {
		log.info("calling note repo for saving the note details");
		
		notesRepo.deleteById(id);		
		
		return new ResponseEntity<>(new ApiResponse("Successfully deleted the note "+id,new Date(),HttpStatus.OK), HttpStatus.OK);
	}
}
