package mito.Proxy.inter.impl;

import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.inter.ICuenta;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.model.Cuenta;

public class CuentaBancoBImpl implements ICuenta {

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() - monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() + monto + 0.20;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
	}

}
