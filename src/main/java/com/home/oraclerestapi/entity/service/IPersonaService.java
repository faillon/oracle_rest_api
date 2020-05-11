package com.home.oraclerestapi.entity.service;

import java.util.List;
import com.home.oraclerestapi.entity.model.Persona;

public interface IPersonaService {
	
	public List<Persona> obtenerTodos();
	public Persona obtenerPersona(String rut);
	public Persona crearPersona(Persona persona);
	public Persona actualizarPersona(Persona persona);

}
