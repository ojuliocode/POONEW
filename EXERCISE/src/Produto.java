public class Produto {
    private double valor;
    private String nome;

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


    public void mostraInfo() {
        System.out.println("Valor >>>" + this.valor);
        System.out.println("Nome >>>" + this.nome);
    }
}
