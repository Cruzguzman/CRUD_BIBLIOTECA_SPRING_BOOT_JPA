package com.totalplay.com.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.totalplay.com.biblioteca.models.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

	
}
