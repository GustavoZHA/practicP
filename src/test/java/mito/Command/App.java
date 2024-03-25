package mito.Command;

import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.commands.Cuenta;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.commands.DepositarImpl;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.commands.Invoker;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.commands.RetirarImpl;

public class App {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1, 200);

		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		
		ivk.realizarOperaciones();
	}

}
