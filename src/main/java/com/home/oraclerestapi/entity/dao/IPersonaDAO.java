package com.home.oraclerestapi.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.home.oraclerestapi.entity.model.Persona;

public interface IPersonaDAO extends CrudRepository<Persona, String> {

}
