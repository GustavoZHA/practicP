package mito.MVC.src.main.java.service;

import java.util.List;

import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.dao.PersonaDAO;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.model.Persona;

public class PersonaServiceImpl implements PersonaService{

	private PersonaDAO dao;
	
	public PersonaServiceImpl(PersonaDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Persona> listar() {		
		return dao.listar();
	}

}
