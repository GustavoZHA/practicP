package mito.Strategy;

import mito.Strategy.strategy.Contexto;
import mito.Strategy.strategy.AntivirusAvanzado;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}
