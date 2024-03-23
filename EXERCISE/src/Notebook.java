public class Notebook extends Produto {
    private String processador;
    private String memoria;

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public void instalarApp(String app){
        System.out.println("Instalando " + app + " ...");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Nome >>>" + this.getNome());
        System.out.println("Valor >>>" + this.getValor());
        System.out.println("Processador >>>" + this.processador);
        System.out.println("Memoria >>>" + this.memoria);
    }

}
