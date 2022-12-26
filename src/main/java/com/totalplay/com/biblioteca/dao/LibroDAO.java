package com.totalplay.com.biblioteca.dao;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.totalplay.com.biblioteca.models.Autor;
import com.totalplay.com.biblioteca.models.Libro;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LibroDAO {
    private Integer id;
    private String isbn;
    private String nombre;
    private String editorial;
    private String genero;
    private int numeroPaginas;
    private BigDecimal precio;
    private LocalDate fechaEdicion;
    private AutorDAO autorDto;
    //private Integer idAutor;
    
    
	public LibroDAO(Libro libro) {
		this.id = libro.getId();
		this.isbn = libro.getIsbn();
		this.nombre = libro.getNombre();
		this.editorial = libro.getEditorial();
		this.genero = libro.getGenero();
		this.numeroPaginas = libro.getNumeroPaginas();
		this.precio = libro.getPrecio();
		this.fechaEdicion = libro.getFechaEdicion();
		this.autorDto = new AutorDAO(libro.getAutor());
		//this.idAutor = idAutor;
	}
  
    
    

}
