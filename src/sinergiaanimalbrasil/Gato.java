package org.sinergiaanimalbrasil;

public class Gato extends Animal {

	private static String som = "Miau";
	
	public void emitirSom(String som) {
		som = Gato.som;
		System.out.println(som);
	}
	
}
