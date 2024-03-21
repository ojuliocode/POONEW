public class Console extends Produto{
    private String geracao;
    private String marca;
    public void jogar(String jogo){
        System.out.println("Jogando " + jogo);
    }

    @Override
    public String mostraInfo() {
        return super.mostraInfo() + this.toString();
    }

    @Override
    public String toString() {
        return "Console{" +
                "geracao='" + geracao + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
