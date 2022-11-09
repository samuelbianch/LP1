package Impressora;

public class Main {
    public static void main(String[] args) {
        ImpressoraJatoDeTinta j = new ImpressoraJatoDeTinta();
        ImpressoMultifuncional mf = new ImpressoMultifuncional();
        realizarImpressao(mf);
        criarCopia(mf);
    }

    public static void realizarImpressao(Impressora i){
        i.imprimir();
    }

    public static void criarCopia(Scanner s){
        s.escanear();
    }
}
