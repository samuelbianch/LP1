package Impressora;

public class ImpressoMultifuncional implements Impressora, Scanner {
    @Override
    public void imprimir(){
        System.out.println("Impresso a laser!");
    }

    @Override
    public void escanear(){
        System.out.println("Escaneado!!");
    }
}
