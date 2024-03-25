package mito.Factory;

import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.inter.IConexion;
import mito.AbstractFactory.inter.impl.ConexionMySQL;
import mito.AbstractFactory.inter.impl.ConexionOracle;
import mito.AbstractFactory.inter.impl.ConexionPostgreSQL;
import mito.AbstractFactory.inter.impl.ConexionSQLServer;
import mito.AbstractFactory.inter.impl.ConexionVacia;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}
}
