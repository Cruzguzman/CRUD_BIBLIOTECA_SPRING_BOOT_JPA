package com.totalplay.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.com.biblioteca.dao.LibroDAO;
import com.totalplay.com.biblioteca.models.Autor;
import com.totalplay.com.biblioteca.repository.LibroRepository;
import com.totalplay.com.biblioteca.services.AutorFab;
import com.totalplay.com.biblioteca.services.LibroFab;
import com.totalplay.com.biblioteca.services.LibroService;

@RestController
@RequestMapping("/api/v1/biblioteca/libros")
public class LibroController {
	@Autowired
	private LibroRepository librorepository;
	@Autowired
	private LibroFab librofab;
	@Autowired
	private LibroService libroservice;
	@Autowired
	private AutorFab autorfab;
	
	@PostMapping("/isertar")
	public ResponseEntity<LibroDAO> insertar(@RequestBody LibroDAO librodao ){
		Autor autor;
		
		return new ResponseEntity<> (libroservice.insertar(librodao), HttpStatus.OK);
	}
	
	
		
	

}
