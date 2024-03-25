package mito.Proxy;

import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.inter.ICuenta;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.inter.impl.CuentaBancoBImpl;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.model.Cuenta;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.proxy.CuentaProxy;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "mitocode", 100);
		
		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
		
	}

}
