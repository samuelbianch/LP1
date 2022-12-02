package sinergiaanimalbrasil;

public abstract class Animal {
	private String nome;
	private int id;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void emitirSom(String som);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "\nNome = " + getNome() + "\nId = " + getId() + "\n------\n";
	}
}
