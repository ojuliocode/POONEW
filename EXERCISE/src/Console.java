public class Console extends Produto{
    private String geracao;
    private String marca;

    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void jogar(String jogo){
        System.out.println("Jogando " + jogo);
    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome >>>" + this.getNome());
        System.out.println("Valor >>>" + this.getValor());
        System.out.println("Processador >>>" + this.geracao);
        System.out.println("Memoria >>>" + this.marca);
    }


}
