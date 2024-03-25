package mito.MVC.src.main.java.dao;

public class MySQL implements Conexion{

	@Override
	public void conectar() {
		System.out.println("Conexi�n a MYSQL");
	}

}
