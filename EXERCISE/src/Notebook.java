public class Notebook extends Produto {
    private String processador;
    private String memoria;

    public void instalarApp(String app){
        System.out.println("Instalando " + app + " ...");
    }

    @Override
    public String mostraInfo() {
        return super.mostraInfo() + this.toString();
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "processador='" + processador + '\'' +
                ", memoria='" + memoria + '\'' +
                '}';
    }
}
