package com.home.oraclerestapi.entity.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "personas")
public class Persona implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9117469545101606028L;
	
	@Id
	private String rut;
	
	@NotEmpty
	private String nombre;
	
	@NotNull
	private int edad;
	
	public Persona(String rut, @NotEmpty String nombre, @NotNull int edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {
		super();
	}

	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rut == null) ? 0 : rut.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (rut == null) {
			if (other.rut != null)
				return false;
		} else if (!rut.equals(other.rut))
			return false;
		return true;
	}
	
	
}
