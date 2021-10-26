package practice.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {
    private int index;
    private final T[] array;

    public MyIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        try {
            T t = array[index];
            return true;
        } catch (Exception ignored) {

        }
        return false;
    }

    @Override
    public T next() {
        T result;
        if (this.hasNext()) {
            result = this.array[index];
            index++;
            return result;
        }
        throw new NoSuchElementException();
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        MyIterator<Integer> myIterator = new MyIterator<>(arr);

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
