package com.example.biblioteca.dto;

import javax.validation.constraints.NotBlank;

import com.example.biblioteca.model.Livro;


public class RequisicaoNovoLivro { 
	private String descricao;
	 @NotBlank
		public String autor;
		public String titulo;
		
		
		
		
		public String getDescricao() {
			return descricao;
		}
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
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Livro toLivro() {
			   Livro livro = new Livro();
			   livro.setAutor(autor);
			   livro.setTitulo(titulo);
			
			   
			return livro;
			   
			  
		}
		
}
