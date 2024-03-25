package mito.AbstractFactory.inter.impl;

import mito.AbstractFactory.inter.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST{

	@Override
	public void leerURL(String url) {
		System.out.println("AREA NO ELEGIDA");
	}

}
