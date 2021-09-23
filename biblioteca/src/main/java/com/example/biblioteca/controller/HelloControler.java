package com.example.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.biblioteca.model.Livro;
import com.example.biblioteca.repository.LivroRepository;


@Controller
@RequestMapping("/hello")
public class HelloControler {
	
	@Autowired
	private LivroRepository repository;
	
	@GetMapping()
	public String home(Model model) {
		List<Livro> livros = repository.findAll();
		model.addAttribute("livros", livros);
		return "hello"; 
	}
	
	@GetMapping("/{id}")
	public String porId(@PathVariable("id") long id, Model model) {
		List<Livro>Livros = repository.findByid(id);
		model.addAttribute("Livros", Livros);
		model.addAttribute("id", id);
		return "hello"; 
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/hello";
	}
}
