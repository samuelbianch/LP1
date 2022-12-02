package sinergiaanimalbrasil;

public class Cachorro extends Animal {
	
	private static String som = "Auau";
	
	public void emitirSom(String som) {
		som = Cachorro.som;
		System.out.println(som);
	}
	
}
