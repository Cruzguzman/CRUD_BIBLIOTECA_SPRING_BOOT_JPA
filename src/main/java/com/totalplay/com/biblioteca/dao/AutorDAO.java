package com.totalplay.com.biblioteca.dao;

import java.util.List;

import com.totalplay.com.biblioteca.models.Autor;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class AutorDAO {
	private Integer id;
    private String nombre;
    private String apellidos;
    private String telefono;
 
	public AutorDAO(Autor autor) {
		this.id = autor.getId() ;
		this.nombre = autor.getNombre();
		this.apellidos =autor.getApellidos();
		this.telefono = autor.getTelefono();
		
	}
    
    
    
}
