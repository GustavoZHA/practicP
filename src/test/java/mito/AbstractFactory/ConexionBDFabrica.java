package mito.AbstractFactory;

import mito.AbstractFactory.inter.FabricaAbstracta;
import mito.AbstractFactory.inter.IConexionBD;
import mito.AbstractFactory.inter.IConexionREST;
import mito.AbstractFactory.inter.impl.ConexionMySQL;
import mito.AbstractFactory.inter.impl.ConexionOracle;
import mito.AbstractFactory.inter.impl.ConexionPostgreSQL;
import mito.AbstractFactory.inter.impl.ConexionSQLServer;
import mito.AbstractFactory.inter.impl.ConexionVacia;

public class ConexionBDFabrica implements FabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
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

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}
