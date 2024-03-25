package mito.Observer;

import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.observer.PesoARGObservador;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.observer.PesoMXObservador;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.observer.SolObservador;
import Patterns.mito.AbstractFactory.src.main.java.com.mitocode.observer.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 d�lares obtendr� : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 d�lares obtendr� : ");
		subject.setEstado(100);
	}
}
