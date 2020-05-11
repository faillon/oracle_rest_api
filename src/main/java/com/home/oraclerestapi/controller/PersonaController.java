package com.home.oraclerestapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.oraclerestapi.entity.PersonaResponse;
import com.home.oraclerestapi.entity.model.Persona;
import com.home.oraclerestapi.entity.service.IPersonaService;

@RestController
public class PersonaController {
	
	private final String URL_BASE = "/api/v1/personas";
	
	@Autowired
	IPersonaService personaService;
	
	@GetMapping("/api/v1/personas")
	public List<Persona> obtenerPersonas(){
		System.out.println("LLegue");
		return personaService.obtenerTodos();
	}
	
	@GetMapping(URL_BASE+"/{rut}")
	public Optional<Persona> obtenerPersona(@PathVariable(value = "rut") String rut) {
		return personaService.obtenerPersona(rut);
	}
	
	@PostMapping(URL_BASE)
	public Persona crearPersona(Persona persona) {
		return personaService.crearPersona(persona);
	}
	
	@PutMapping(URL_BASE+"/{rut}")
	public PersonaResponse actualizarPersona(Persona persona) {
		return personaService.actualizarPersona(persona);
	}

}
