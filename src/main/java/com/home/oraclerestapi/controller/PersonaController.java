package com.home.oraclerestapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.oraclerestapi.entity.model.Persona;
import com.home.oraclerestapi.entity.service.IPersonaService;

@RestController
@RequestMapping("/api/v1")
public class PersonaController {
	
	@Autowired
	IPersonaService personaService;
	
	@GetMapping("/personas")
	public ResponseEntity<List<Persona>> obtenerPersonas(){
		System.out.println(this.getClass().getSimpleName());
		List<Persona> personas = personaService.obtenerTodos();
		return new ResponseEntity<List<Persona>>(personas, HttpStatus.OK);
	}
	
	@GetMapping("/{rut}")
	public ResponseEntity<Persona> obtenerPersona(@PathVariable(value = "rut") String rut) {
		Persona per = personaService.obtenerPersona(rut);
		return new ResponseEntity<Persona>(per, HttpStatus.OK);
	}
	
	@PostMapping("/personas")
	public ResponseEntity<Persona> crearPersona(Persona persona) {
		Persona per = personaService.crearPersona(persona);
		System.out.println("Mundo");
		return new ResponseEntity<Persona>(per, HttpStatus.CREATED);
	}
	
	@PutMapping("/{rut}")
	public ResponseEntity<Persona> actualizarPersona(Persona persona) {
		Persona per = personaService.actualizarPersona(persona);
		return new ResponseEntity<Persona>(per, HttpStatus.OK);
	}

}
