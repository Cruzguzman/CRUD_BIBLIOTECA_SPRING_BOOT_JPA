package com.totalplay.com.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.com.biblioteca.dao.LibroDAO;
import com.totalplay.com.biblioteca.models.Autor;
import com.totalplay.com.biblioteca.repository.AutorRepository;
import com.totalplay.com.biblioteca.repository.LibroRepository;

@Service
public class LibroService {
	@Autowired
    private LibroRepository librorepository;
    @Autowired
    private LibroFab librofab;

    @Autowired
    private AutorRepository autorrepository;

    @Autowired
    private AutorFab autorfab;
	
	public LibroDAO insertar(LibroDAO librodao) {
		Autor autor=autorrepository.findById(librodao.getIdAutor()).get();
		librodao.setAutorDto(autorfab.crearautordao(autor));
		
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
