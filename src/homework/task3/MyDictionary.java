package homework.task3;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey,TValue> {
    private Map<TKey, TValue> map = new HashMap<>();

    public void addElement(TKey key, TValue value) {
        map.put(key, value);
    }

    public TValue getElement(TKey key) {
        return map.get(key);
    }

    public int getLength() {
        return map.size();
    }



    public static void main(String[] args) {
        MyDictionary myDictionary = new MyDictionary();
        myDictionary.addElement(1, "One");
        myDictionary.addElement(2, "Two");
        myDictionary.addElement(3, "Three");

        System.out.println("Element with key 2 is: " + myDictionary.getElement(2));
        System.out.println("myDictionary length is: " + myDictionary.getLength());
    }
}
