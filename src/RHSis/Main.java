package RHSis;

import utils.Teclado;

public class Main {
    public static void main(String[] args) {
        int resp = 0, quant = 0;
        Teclado t = new Teclado();
        Funcionario[] f = new Funcionario[10];

        do  {
			System.out.println("------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Mostrar");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Excluir");
			System.out.println("5 - Sair");
			System.out.println("------------------------------");
			resp = t.leInt("Qual operação deseja fazer?");
			switch (resp) {
				case 1:
                    f[quant] = new Funcionario(
                        t.leString("Nome: "),
                        t.leString("Tipo (N1 ou N2): "),
                        t.leDouble("Salario base: "),
                        quant
                    );

                    quant++;
					
					break;
				case 2:
					for(int i=0; i<quant; i++){
						if(f[i] != null){
							System.out.println("");
							System.out.println("----------------------");
							System.out.println(f[i].toString());
						}
                    }
					break;
				case 3:
                    int id = t.leInt("Digite o ID do funcionario: ");

                    f[id].setNome(t.leString("Nome: "));
                    f[id].setTipo(t.leString("Tipo (N1 ou N2): "));
                    f[id].setSalarioBase(t.leDouble("Salario base: "));
					break;

				case 4:
                    id = t.leInt("Digite o ID do funcionario: ");

                    f[id] = null;
					break;
				case 5:
					System.exit(0);
					break;
			}
		}while(resp != 5);
    }
}
