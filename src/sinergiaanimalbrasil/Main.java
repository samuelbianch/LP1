package sinergiaanimalbrasil;

public class Main {

	public static void main(String[] args) {
		Gato[] gato = new Gato[2];
		Cachorro[] dog = new Cachorro[2];
		Teclado t = new Teclado();
		int resp = 0;
		
		do {
			System.out.println("1 - Criar");
			System.out.println("2 - Ver");
			System.out.println("3 - Excluir");
			System.out.println("4 - Atualizar");
			try {
				resp = t.leInt("Digite a opcao: ");
			} catch (NumberFormatException ne) {
				System.out.println("Você precisa digitar um inteiro");
			}
			
			
			switch(resp) {
			case 1:
				try {
					System.out.println("1 - Gato | 2 - Cachorro");
					int opc = t.leInt();
					if (opc == 1) {
						for (int i = 0; i < gato.length; i++) {
							if (gato[i] == null) {
								gato[i] = new Gato();
								gato[i].setNome(t.leString("Digite o nome"));
								gato[i].setId(i);
								break;
							}
						}
					}if (opc == 2) {
						for (int i = 0; i < dog.length; i++) {
							if (dog[i] == null) {
								dog[i] = new Cachorro();
								dog[i].setNome(t.leString("Digite o nome"));
								dog[i].setId(i);
								break;
							}
						}
					}
				} catch (NullPointerException ne) {
					System.out.println("Excecao de ponteiro nulo");
				}
				break;
				
			case 2:
				try {
					System.out.println("\nGatos:");
					for (int i = 0; i < gato.length; i++) {
						if(gato[i] != null) System.out.println(gato[i].toString());
					}
					System.out.println("\n\nCachorros:");
					for (int i = 0; i < dog.length; i++) {
						if(dog[i] != null) System.out.println(dog[i].toString());
					}
				} catch(NullPointerException e) {
					System.out.println("Nenhum gato/cachorro cadastrado");
				}
				
				break;
				
			case 3:
				try {
					System.out.println("Deseja excluir: [1] Gato | [2] Cachorro");
					int opc = t.leInt();
					if (opc == 1) {
						int opc1 = t.leInt("Qual a id: ");
						for (int i = 0; i < gato.length; i++) {
							if (gato[i] != null && gato[i].getId() == opc1) {
								gato[i] = null;
							}
						}
					}if (opc == 2) {
						int opc2 = t.leInt("Qual a id: ");
						for (int i = 0; i < dog.length; i++) {
							if (dog[i] != null && dog[i].getId() == opc2) {
								dog[i] = null;
							}
						}
					}
				} catch (NullPointerException ne) {
					System.out.println("Excecao de ponteiro nulo");
				}
				break;
				
			case 4:
				try {
					System.out.println("1 - Gato | 2 - Cachorro");
					int opc1 = t.leInt();
					int id = t.leInt("Id que deseja atualiazr: ");
					if (opc1 == 1) {
						for (int i = 0; i < gato.length; i++) {
							if (gato[i].getId() == id) {
								gato[i].setNome(t.leString("Digite o nome"));
								break;
							}
						}
					}if (opc1 == 2) {
						for (int i = 0; i < dog.length; i++) {
							if (dog[i].getId() == id) {
								dog[i].setNome(t.leString("Digite o nome"));
								break;
							}
						}
					}
					
				} catch (NullPointerException ne) {
					System.out.println("Excecao de ponteiro nulo");
				}
				break;
				
				
			}
		}while(resp != 5);
	}
}

