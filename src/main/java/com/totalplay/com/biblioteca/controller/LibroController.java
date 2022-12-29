package com.totalplay.com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.com.biblioteca.dao.LibroDAO;
import com.totalplay.com.biblioteca.services.LibroService;

@RestController
@RequestMapping("/api/v1/biblioteca/libros")
public class LibroController {

	@Autowired
	private LibroService libroService;

	@PostMapping("insertar")
	public ResponseEntity<LibroDAO> insertar(@RequestBody LibroDAO libroDTO) {
		try {
			return new ResponseEntity<>(libroService.insertar(libroDTO), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/listar")
	public ResponseEntity<List<LibroDAO>> enlistar() {
		return new ResponseEntity<>(libroService.enlistarlibros(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<LibroDAO> findById(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(libroService.buscarporidlibro(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id ){
        try{
            libroService.eliminarporid(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
