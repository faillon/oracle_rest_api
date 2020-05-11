package com.home.oraclerestapi.entity;

import com.home.oraclerestapi.entity.model.Persona;

public class PersonaResponse {
	
	private Persona persona;
	private String mensaje;
	
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
