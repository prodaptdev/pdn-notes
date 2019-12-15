package com.pro.app.exception;

public class NoteNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public NoteNotFoundException(Integer noteId) {
		super("Note id "+noteId+" does not exists");
	}

}
