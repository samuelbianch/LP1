import utils.Teclado;

public class Main {
	
	public static void main(String[] args) {
		Teclado t = new Teclado();
		Pais[] pais = new Pais[10];
		int resp = 0, i = 0;
		do  {
			System.out.println("------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Mostrar países");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Excluir");
			System.out.println("5 - Sair");
			System.out.println("------------------------------");
			resp = t.leInt("Qual operação deseja fazer?");
			switch (resp) {
				case 1:
					pais[i] = new Pais(
						t.leString("Digite o código ISO do país: "),
						t.leString("Digite o nome do país: "),
						t.leString("Digite a população: "),
						t.leString("Digite a área do país: ")
					);
					i++;
					break;
				case 2:
					for (int a=0; a<i; a++) {
						if (pais[a] != null) {
							System.out.println("");
							System.out.println("----------------------");
							System.out.println("ID: " + a);
							pais[a].show();
						}
					}
					
					break;
				case 3:
					int id = t.leInt("Digite o ID do país: ");

					pais[id].setIso(t.leString("Digite o código ISO: "));
					pais[id].setNome(t.leString("Digite o nome: "));
					pais[id].setPopulacao(t.leString("Digite a população: "));
					pais[id].setDimensao(t.leString("Digite a área do país: "));
					break;

				case 4:
					id = t.leInt("Digite o ID do país: ");

					pais[id] = null;
					break;
				case 5:
					System.exit(0);
					break;
			}
		}while(resp != 5);
	}

}
