package com.totalplay.com.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.totalplay.com.biblioteca.dao.AutorDAO;
import com.totalplay.com.biblioteca.models.Autor;

@Service
public class AutorFab {
	
	public Autor crearautor(AutorDAO autordao) {
		return new Autor(autordao);
		
	}
	
	public AutorDAO crearautordao(Autor autor) {
		return new AutorDAO(autor);
	}

	public List<AutorDAO> crearautoresdaoL(List<Autor> listaautores){
		List<AutorDAO> autoresdao= new ArrayList<>();
		listaautores.stream().forEach(
				autor-> {
					autoresdao.add(crearautordao(autor));
				}
				);
		return autoresdao;
		
	}
}
