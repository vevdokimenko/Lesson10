package practice.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {
    private int index;
    private T[] array;

    public MyIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        try {
            T t = array[index];
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public T next() {
        if (this.hasNext())
            return this.array[index];
        return null;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2};
        MyIterator<Integer> myIterator = new MyIterator<>(arr);

        System.out.println(myIterator.hasNext());
        System.out.println(myIterator.next());
    }
}
