package com.prodapt.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.app.model.dto.ApiResponse;
import com.prodapt.app.model.prodapt.Notes;
import com.prodapt.app.service.NoteService;

/**
 * @author arunkumar.a
 *
 */
@RestController
public class NotesController {
	
	@Autowired
	NoteService noteService;
	
	@GetMapping("/v1/getAllNotes")
	public List<Notes> getAllNotes() {
		return noteService.getAllNotesFromRepo();
	}
	
	@GetMapping("/v1/getNote/{id}")
	public ResponseEntity<?> getNotesId(
			@PathVariable("id") Integer id) 
	{
		return new ResponseEntity<>(noteService.getNotesByIdFromRepo(id),HttpStatus.OK);
	}
	
	
	@PostMapping("/v1/SaveNotes")
	public ResponseEntity<?> saveNotes(
			@RequestBody List<Notes> notes) 
	{
		ResponseEntity<ApiResponse> apiResp = noteService.saveNotesInRepo(notes);
		
		return apiResp;
		
	}
	
	@DeleteMapping("/v1/deleteNote/{id}")
	public ResponseEntity<?> deleteNoteById(
			@PathVariable("id") Integer id) 
	{		
		ResponseEntity<ApiResponse> apiResp = noteService.deleteNoteByIdFromRepo(id);
		
		return apiResp;
	}
	

}
