package com.totalplay.com.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.totalplay.com.biblioteca.dao.LibroDAO;
import com.totalplay.com.biblioteca.repository.LibroRepository;

public class LibroService {
	@Autowired
	private LibroRepository librorepository;
	@Autowired
	private LibroFab librofab;
	
	public LibroDAO insertar(LibroDAO librodao) {
		return librofab.crearlibrodao(librorepository.save(librofab.crearlibro(librodao)));
	}
	
	public List<LibroDAO> enlistarlibros(){
		return librofab.crearlibrosdto(librorepository.findAll());
		
		
	}
	
	public LibroDAO buscarporidlibro(Integer id) {
		return librofab.crearlibrodao(librorepository.findById(id).get());
	}
	
	public void eliminarporid(Integer id) {
		librorepository.deleteById(id);
	}
}
