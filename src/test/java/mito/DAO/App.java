package mito.DAO;

import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.dao.CRUD;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.dao.PersonaDAOImpl;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.model.Persona;

public class App {
	
	public static void main(String[] args) {
		CRUD<Persona> dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
		
		Persona per = new Persona();
		per.setNombres("MitoCode");
		dao.registrar(per);
	}

}
