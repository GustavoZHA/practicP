package mito.Decorator.decorador;

import mito.Decorator.interf.ICuentaBancaria;
import mito.Decorator.model.Cuenta;

public class BlindajeDecorador extends CuentaDecorador {

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);
		agregarBlindaje(c);
	}

	public void agregarBlindaje(Cuenta c) {		
		System.out.println("Se agreg� blindaje a la cuenta del cliente " + c.getCliente());
	}

}
