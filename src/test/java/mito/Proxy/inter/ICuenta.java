package mito.Proxy.inter;

import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.model.Cuenta;

public interface ICuenta {

	Cuenta retirarDinero(Cuenta cuenta, double monto);
	Cuenta depositarDinero(Cuenta cuenta, double monto);
	void mostrarSaldo(Cuenta cuenta);
}
