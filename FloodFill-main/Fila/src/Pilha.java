import java.util.Arrays;

public class Pilha<T> {
    private T[] stackValues;
    private int top;
    public Pilha(int defaultCapacity) {
        stackValues = (T[]) new Object[defaultCapacity];
        top = -1;
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == stackValues.length-1);
    }

    public void push(T value) {
        if (!isFull()) {
            top++;
            stackValues[top] = value;
        } else {
            throw new RuntimeException("Stack Overflow");
        }

    }
    public int[] pop() {
        if (!isEmpty()) {
            stackValues[top] = null;
            top--;
        } else {
            throw new RuntimeException("Stack vazia");
        }
        return new int[0];
    }
    public T top() {
        if (isEmpty()) return null;
        return stackValues[top];
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "stackValues=" + Arrays.toString(stackValues) +
                ", top=" + top +
                '}';
    }

    public int size() {

        return top+1;
    }
}
