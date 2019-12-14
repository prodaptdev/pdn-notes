package com.prodapt.app.model.prodapt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "notes")
@Data
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "NoteID")
	private Integer noteID;
	@Column(name = "NoteTechnology")
	private String noteTechnology;
	@Column(name = "Note")
	private String note;
	@Column(name = "NoteCodeSample")
	private String noteCodeSample;
	@Column(name = "NoteIssue")
	private String noteIssue;
	@Column(name = "NoteSolution")
	private String noteSolution;
	@Column(name = "NoteReferenceLinks")
	private String noteReferenceLinks;
	@Column(name = "EmpID")
	private Integer empID;	
}
