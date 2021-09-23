package com.example.biblioteca.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.biblioteca.dto.RequisicaoNovoLivro;
import com.example.biblioteca.model.Livro;
import com.example.biblioteca.repository.LivroRepository;

@Controller
@RequestMapping("livro")
public class LivroController {
@Autowired
  private LivroRepository livroRepository;
  
@GetMapping("formulario")

  public String formulario(RequisicaoNovoLivro requisicao) {
	  return "livro/formulario";
  }

@PostMapping("novo")
  public String novo(@Valid RequisicaoNovoLivro requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "livro/formulario";
		}
		
		Livro  livro = requisicao.toLivro();
		livroRepository.save(livro);
		
		 return "redirect:/hello";
	}
	
}
  
           

