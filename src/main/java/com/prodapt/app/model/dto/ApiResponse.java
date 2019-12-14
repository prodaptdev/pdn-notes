package com.prodapt.app.model.dto;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Data;

@Data
@ResponseBody
public class ApiResponse {
	private String resultDescription;
	private Date timestamp;
	private HttpStatus status;
	public ApiResponse(String resultDescription, Date timestamp, HttpStatus status) {
		super();
		this.resultDescription = resultDescription;
		this.timestamp = timestamp;
		this.status = status;
	}
}
