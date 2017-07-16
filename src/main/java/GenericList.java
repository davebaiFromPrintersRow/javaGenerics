package main.java;

public class GenericList<T> implements GenericInterfaceExample<T> {
    public T myList;

    @Override
    public void add(T t) {
        this.myList = t;
    }

    public static void main(String[] args) {
        GenericInterfaceExample<String> list = new GenericList<>();
        list.add("Good afternoon");
    }
}
