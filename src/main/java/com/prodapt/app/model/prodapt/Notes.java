package com.prodapt.app.model.prodapt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description="All details about the notes. ")
@Entity
@Table(name = "notes")
@Data
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NoteID")
	private Integer id;
	@Column(name = "NoteTechnology")
	private String technology;
	@Column(name = "Note")
	private String note;
	@Column(name = "NoteCodeSample")
	private String codeSample;
	@Column(name = "NoteIssue")
	private String issue;
	@Column(name = "NoteSolution")
	private String solution;
	@Column(name = "NoteReferenceLinks")
	private String referenceLinks;
	@Column(name = "EmpID")
	private Integer empID;	
}
