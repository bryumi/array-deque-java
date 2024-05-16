import arrayDeque.ArrayDeque;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayDeque<String> lista = new ArrayDeque<>();
        lista.adicionarNoInicio("A");
        lista.adicionarNoFim("B");
        lista.adicionarNoFim("C");
        lista.adicionarNoInicio("Z");

        System.out.println(lista);

        lista.removerDoInicio();
        System.out.println(lista); 
        lista.removerDoFim();
        System.out.println(lista); 
    }
}
