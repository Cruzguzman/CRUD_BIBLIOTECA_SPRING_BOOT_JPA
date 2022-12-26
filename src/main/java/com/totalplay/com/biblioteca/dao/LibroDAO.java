package com.totalplay.com.biblioteca.dao;

import java.math.BigDecimal;
import java.time.LocalDate;


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


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getNumeroPaginas() {
		return numeroPaginas;
	}


	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}


	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}


	public AutorDAO getAutorDto() {
		return autorDto;
	}


	public void setAutorDto(AutorDAO autorDto) {
		this.autorDto = autorDto;
	}


  
    
    

}
