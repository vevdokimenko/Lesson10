package practice.task1;

public class MyClass<T> {
    public T field;

    public MyClass(T field) {
        this.field = field;
    }

    public void show() {
        System.out.println(this.field.getClass());
    }

    public static void main(String[] args) {
        new MyClass<Integer>(10).show();
    }
}
