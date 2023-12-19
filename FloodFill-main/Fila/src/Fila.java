public class Fila<T> {
    private T[] values;
    private int   first;
    private int   reference;
    private int   last;
    private int   total;
    public Fila(int tamanho) {
        values = (T[]) new Object[tamanho];
        first  = 0;
        last   = 0;
        total  = 0;
        reference = 0;
    }
    public void insert(T e) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia");
        }
        values[last] = e;
        last++;
        reference = last;
        total++;
    }
    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        T e = values[first];
        int i = 0;
        while (reference != 0) {
            values[first + i] = values[first + 1 + i];
            reference--;
            i++;
        }
        last--;
        reference = last;
        total--;
        return e;
    }
    public boolean isEmpty() {
        return (total == 0);
    }

    public boolean isFull() {
        return total == values.length;
    }

}
