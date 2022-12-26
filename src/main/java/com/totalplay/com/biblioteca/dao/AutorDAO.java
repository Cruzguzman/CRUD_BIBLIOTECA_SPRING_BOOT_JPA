package com.totalplay.com.biblioteca.dao;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.totalplay.com.biblioteca.models.Autor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
public class AutorDAO {
	private Integer id;
    private String nombre;
    private String apellidos;
    private String telefono;
       
    public AutorDAO() {
    	
    }
 
	public AutorDAO(Autor autor) {
		this.id = autor.getId() ;
		this.nombre = autor.getNombre();
		this.apellidos =autor.getApellidos();
		this.telefono = autor.getTelefono();		
	}
	



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	



	
    
    
    
}
