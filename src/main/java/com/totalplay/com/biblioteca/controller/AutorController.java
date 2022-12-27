package com.totalplay.com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.com.biblioteca.dao.AutorDAO;
import com.totalplay.com.biblioteca.services.AutorService;

@RestController
@RequestMapping("/api/v1/biblioteca")
public class AutorController {
	@Autowired
	private AutorService autorservice;
	
	
	@PostMapping("/insertar")
	
	public ResponseEntity< AutorDAO> insertar(@RequestBody AutorDAO autordao) {
		
		return new ResponseEntity<>( autorservice.insertar(autordao),HttpStatus.CREATED);
	}

	@GetMapping("/lista")
	public List<AutorDAO> enlistar(){
		
		return autorservice.enlistar();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AutorDAO> buscarporid(@PathVariable Integer id){
		return new ResponseEntity<>(autorservice.buscarporid(id),HttpStatus.OK);
	}
}
