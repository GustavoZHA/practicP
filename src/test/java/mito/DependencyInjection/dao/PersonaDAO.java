package mito.DependencyInjection.dao;

import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.model.Persona;

public interface PersonaDAO extends CRUD<Persona>{

	void mostrarNombre();
	void setConexion(IConexion conexion);
	
}
