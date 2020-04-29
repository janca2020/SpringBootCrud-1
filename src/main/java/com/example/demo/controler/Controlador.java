package com.example.demo.controler;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceServices.IpersonaService;
import com.example.demo.modelo.Persona;


	



@Controller
@RequestMapping
public class Controlador {
	 @Autowired
	 private IpersonaService service;
	@GetMapping("/listar") 
 public String listar(Model model) {
	
	List<Persona>personas=service.listar();
	model.addAttribute("personas", personas);
	return "index";
 }
	
	@GetMapping("/new")
	public String agregar(Model model) {
		
		model.addAttribute("persona",new Persona());
		return "form";
	}
	
	@GetMapping("/save")
	public String save(@Valid Persona p,Model model) {
		
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/valid")
	public String valid(@Valid Persona p,Model model) {
		
		service.save(p);
		return "redirect:/validaciones";
	}

	
	@GetMapping("/editar/{id}")
	public String editar(Model model , @PathVariable int id ) {
		Optional<Persona>persona=service.listarId(id);
		model.addAttribute("persona", persona);
		
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
		
	}

}
