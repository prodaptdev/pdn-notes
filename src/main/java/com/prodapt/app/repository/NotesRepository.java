package com.prodapt.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.app.model.prodapt.Notes;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Integer> {
	
}
