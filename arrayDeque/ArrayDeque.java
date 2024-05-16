package arrayDeque;

public class ArrayDeque <T> {
    private Object[] array;
    private int tamanho;
    private int inicio; 
    private int fim; 

    public ArrayDeque() {
        array = new Object[10];
        tamanho = 0;
        inicio = array.length/2;
        fim = inicio -1;
    }
    public void adicionarNoInicio(T elemento) {
        if (tamanho == array.length) {
            redimensionarArray();
        }
        inicio--;
        array[inicio] = elemento;
        tamanho++;
    }

    public void adicionarNoFim(T elemento) {
        if (tamanho == array.length) {
            redimensionarArray();
        }
        fim++;
        array[fim] = elemento;
        tamanho++;
    }

    public T removerDoInicio() {
        if (tamanho == 0) {
            throw new IllegalStateException("A lista está vazia");
        }
        T elemento = (T) array[inicio];
        array[inicio] = null;
        inicio++;
        tamanho--;
        return elemento;
    }

    public T removerDoFim() {
        if (tamanho == 0) {
            throw new IllegalStateException("A lista está vazia");
        }
        T elemento = (T) array[fim];
        array[fim] = null;
        fim--;
        tamanho--;
        return elemento;
    }

    private void redimensionarArray() {
        int novoTamanho = array.length * 2;
        Object[] newArray = new Object[novoTamanho];
        int novoInicio = (novoTamanho - tamanho) / 2;
        int novoFim = novoInicio + tamanho - 1;
        
        System.arraycopy(array, inicio, newArray, novoInicio, tamanho);
        array = newArray;
        inicio = novoInicio;
        fim = novoFim;
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = inicio; i <= fim; i++) {
            builder.append(array[i]);
            if (i < fim) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
