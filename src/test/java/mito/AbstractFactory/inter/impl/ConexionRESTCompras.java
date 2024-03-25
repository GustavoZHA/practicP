package mito.AbstractFactory.inter.impl;

import mito.AbstractFactory.inter.IConexionREST;

public class ConexionRESTCompras implements IConexionREST{

	@Override
	public void leerURL(String url) {		
		System.out.println("Conect�ndose a " + url);
	}

}
