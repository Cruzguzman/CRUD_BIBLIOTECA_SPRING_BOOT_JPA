package com.totalplay.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public AutorDAO insertar(@RequestBody AutorDAO autordao) {
		
		return autorservice.insertar(autordao);
	}

}
