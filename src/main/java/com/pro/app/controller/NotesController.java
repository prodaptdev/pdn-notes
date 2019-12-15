package com.pro.app.controller;

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

import com.pro.app.model.dto.ApiResponse;
import com.pro.app.model.prodapt.Notes;
import com.pro.app.service.NoteService;

import io.swagger.annotations.ApiOperation;

/**
 * @author arunkumar.a
 *
 */
@RestController
public class NotesController {
	
	@Autowired
	NoteService noteService;
	
	@ApiOperation(value = "Find all notes",notes = "Retrieves list of notes from prodapt.notes table")
	@GetMapping("/v1/getAllNotes")
	public List<Notes> getAllNotes() {
		return noteService.getAllNotesFromRepo();
	}
	
	@ApiOperation(value = "Find a note",notes = "Retrieve a note from prodapt.notes table")
	@GetMapping("/v1/getNote/{id}")
	public ResponseEntity<?> getNotesId(
			@PathVariable("id") Integer id) 
	{
		return new ResponseEntity<>(noteService.getNotesByIdFromRepo(id),HttpStatus.OK);
	}
		
	@ApiOperation(value = "Save a list of notes",notes = "Saves a list of notes in prodapt.notes table")
	@PostMapping("/v1/SaveNotes")
	public ResponseEntity<?> saveNotes(
			@RequestBody List<Notes> notes) 
	{
		ResponseEntity<ApiResponse> apiResp = noteService.saveNotesInRepo(notes);
		
		return apiResp;
		
	}
	
	@ApiOperation(value = "Deletes a note",notes = "Deletes a note from prodapt.notes table")
	@DeleteMapping("/v1/deleteNote/{id}")
	public ResponseEntity<?> deleteNoteById(
			@PathVariable("id") Integer id) 
	{		
		ResponseEntity<ApiResponse> apiResp = noteService.deleteNoteByIdFromRepo(id);
		
		return apiResp;
	}
	

}
