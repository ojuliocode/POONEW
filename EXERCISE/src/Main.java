public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.instalarApp("Minecraft");
        notebook.setMemoria("4gb");
        notebook.setNome("Acer");
        notebook.setProcessador("Intel i7");
        notebook.setValor(2700);
        notebook.mostraInfo();
    }
}