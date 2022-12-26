package com.totalplay.com.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.com.biblioteca.dao.AutorDAO;
import com.totalplay.com.biblioteca.repository.AutorRepository;

@Service
public class AutorService {
	
	@Autowired
	private AutorFab autorfab;
	
	@Autowired
	private AutorRepository autorrepository;

	//metodo guardar
	public AutorDAO insertar(AutorDAO autordao) {
		return  autorfab.crearautordao(autorrepository.save(autorfab.crearautor(autordao)));
	}
	
	//metodo enlistar
	public List<AutorDAO> enlistar(){
		return autorfab.crearautoresdao(autorrepository.findAll());
	}
	//metodo buscar por id
	public AutorDAO buscarporid( Integer id) {
		return autorfab.crearautordao(autorrepository.findById(id).get());
		
	}
	//metodo aliminar por id
	public void eliminarporid(Integer id) {
		autorrepository.deleteById(id);
		
	}
}
