package extra;

import java.util.ArrayList;
import java.util.List;

public class MyClass<T> {
    public static <T> List<T> factoryMethod(T element) {
        List<T> list = new ArrayList<>();
        list.add(element);
        return list;
    }

    public static void main(String[] args) {
        // 4 : Integer
        System.out.println(factoryMethod(4).get(0) + " : " + factoryMethod(4).get(0).getClass().getSimpleName());

        // String : String
        System.out.println(factoryMethod("String").get(0) + " : " + factoryMethod("String").get(0).getClass().getSimpleName());

        // true : Boolean
        System.out.println(factoryMethod(true).get(0) + " : " + factoryMethod(true).get(0).getClass().getSimpleName());
    }
}
