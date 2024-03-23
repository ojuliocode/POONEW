public class Produto {
    private double valor;

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public void mostraInfo() {
        System.out.println("valor=" + valor +
                ", nome='" + nome + '\'');
    }
}
