package com.totalplay.com.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.totalplay.com.biblioteca.dao.LibroDAO;
import com.totalplay.com.biblioteca.models.Libro;

@Service
public class LibroFab {

	public Libro crearlibro(LibroDAO librodao) {		
		return new Libro(librodao);
		
	}
	public LibroDAO crearlibrodao(Libro libro) {
		
		return new LibroDAO(libro);
		
	}
	
	public List<LibroDAO> crearlibrosdto(List<Libro> libros){
		List<LibroDAO> librosdao= new ArrayList<>();
		libros.stream().forEach(
				libro->{
					librosdao.add(new LibroDAO(libro));
				}
				);
		
		return librosdao;
	}
}
