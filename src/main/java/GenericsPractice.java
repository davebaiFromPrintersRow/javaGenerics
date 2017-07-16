package main.java;

public class GenericsPractice<E> {

    public static void main(String[] args) {
        Person<Employee> e1 = new Person<>();
        Person<Contact> c1 = new Person<>();

        Employee e = new Employee("John", "S", "12345");
        Contact c = new Contact("Mrs.", "Peggy", "Fish", "343-222-3433");
        e1.setPerson(e);
        c1.setPerson(c);

        System.out.println(e1.getPerson());
        System.out.println(c1.getPerson());

        Integer[] ints = {10, 20, 30, 40, 50, 60, 70, 80};
        String[] strings = {"dog", "cat", "magnolia", "carter", "sundae"};

        print(ints);
        print(strings);

        System.out.println(countGreaterThan(ints, 50));
    }

    public static <E> void print(E[] list) {
        for (E element : list) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] list, T elem) {
        int count = 0;
        for (T element : list) {
            if (element.compareTo(elem) > 0) {
                count++;
            }
        }
        return count;
    }
}
