package com.prodapt.app.model.prodapt;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description="All details about the notes. ")
@Entity
@Table(name = "notes")
@Data
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "Technology")
	private String technology;
	@Column(name = "Note")
	private String note;
	@Column(name = "CodeSample")
	private String codeSample;
	@Column(name = "Issue")
	private String issue;
	@Column(name = "Solution")
	private String solution;
	@Column(name = "ReferenceLinks")
	private String referenceLinks;
	@Column(name = "UserID")
	private String userID;	
	@Column(name = "LastModifiedUser")
	private String lastModifiedUser;
	@Generated(GenerationTime.ALWAYS)
	@Column(name = "LastModifiedDate")
	private Timestamp lastModifiedDate;	
}
