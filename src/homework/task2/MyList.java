package homework.task2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private final List<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public T getElement(int index) {
        return list.get(index);
    }

    public int getLength() {
        return list.size();
    }



    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.addElement("One");
        myList.addElement("Two");
        myList.addElement("Three");

        System.out.println("The element in index 1: " + myList.getElement(1));
        System.out.println("The length of myList is: " + myList.getLength());
    }
}
