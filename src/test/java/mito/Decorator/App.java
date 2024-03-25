package mito.Decorator;

import mito.Decorator.decorador.BlindajeDecorador;
import mito.Decorator.interf.ICuentaBancaria;
import mito.Decorator.interf.impl.CuentaAhorro;
import mito.Decorator.model.Cuenta;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "MitoCode");
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		//cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}

}
