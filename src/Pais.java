public class Pais {
    
    private int iso;
    private String nome;
    private String populacao;
    private String dimensao;
    private int i;
    int fronteira[];

    Teclado teclado = new Teclado();

    public Pais(int iso, String nome, String populacao, String dimensao) {
        this.iso = iso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }


    public int getIso() {
        return iso;
    }

    public void setIso(int iso) {
        this.iso = iso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }
    
    public boolean verificarPaisIgual(Pais b){
        if (getIso() == b.getIso()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void addFronteira(){
        int b = teclado.leInt("Digite o código ISO: ");
        for (i = 0; i < this.fronteira.length; i++){
            if (this.fronteira[i] == 0) {
                this.fronteira[i] = b;
            }
        }
    }

    public void analisarLimitrofe(Pais b){
        int c = 0;
        for (i = 0; i < this.fronteira.length; i++){
            if (this.fronteira[i] == b.getIso()) {
                System.out.println("É um país limítrofe");
                c = 1;
                break;
            }
        }
        if (c == 0)
            System.out.println("Não é um país limítrofe");
    }

    double calcularDensidade(){
        return Integer.parseInt(this.populacao) / Integer.parseInt(this.dimensao);
    }

    public void paisesVizinhosIguais(Pais b){
        for (i = 0; i < this.fronteira.length; i++){
            if (this.fronteira[i] == b.getIso()) {
                System.out.println("A FAZER");
            }
        }
    }

}
