package com.home.oraclerestapi.entity.service;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.oraclerestapi.entity.dao.IPersonaDAO;
import com.home.oraclerestapi.entity.model.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaDAO personaDao;

	@Override
	public List<Persona> obtenerTodos() {
		try {
			return (List<Persona>) personaDao.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Collections.emptyList();
	}

	@Override
	public Persona obtenerPersona(String rut) {
		try {
			return personaDao.findById(rut).get();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return new Persona();
	}

	@Override
	public Persona crearPersona(Persona persona) {
		try {
			return personaDao.save(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return new Persona();
	}

	@Override
	public Persona actualizarPersona(Persona persona) {
		boolean existe = personaDao.findById(persona.getRut()).isPresent();		
		
		if(existe) {
			return personaDao.save(persona);
		}else{
			return new Persona();
		}
	}

}
