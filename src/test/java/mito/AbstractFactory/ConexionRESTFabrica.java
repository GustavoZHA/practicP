package mito.AbstractFactory;

import mito.AbstractFactory.inter.FabricaAbstracta;
import mito.AbstractFactory.inter.IConexionBD;
import mito.AbstractFactory.inter.IConexionREST;
import mito.AbstractFactory.inter.impl.ConexionRESTCompras;
import mito.AbstractFactory.inter.impl.ConexionRESTNoArea;
import mito.AbstractFactory.inter.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}
