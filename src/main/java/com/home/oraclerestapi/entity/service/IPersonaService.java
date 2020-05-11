package com.home.oraclerestapi.entity.service;

import java.util.List;
import java.util.Optional;

import com.home.oraclerestapi.entity.PersonaResponse;
import com.home.oraclerestapi.entity.model.Persona;

public interface IPersonaService {
	
	public List<Persona> obtenerTodos();
	public Optional<Persona> obtenerPersona(String rut);
	public Persona crearPersona(Persona persona);
	public PersonaResponse actualizarPersona(Persona persona);

}
