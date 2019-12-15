package com.pro.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.app.model.prodapt.Notes;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Integer> {
	
}
