package com.example.biblioteca.model;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	public long id; 
public String autor;
public String titulo;
private String descricao;




	
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getdescricao() {
		return descricao;
	}
	

}
