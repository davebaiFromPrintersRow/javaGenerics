package main.java;

import java.util.ArrayList;
import java.util.List;

public class EliminateDupes {


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("red");
        strings.add("green");
        strings.add("blue");
        strings.add("yellow");
        strings.add("red");
        List<String> result = removeDupes(strings);
        System.out.println(result);
    }

    public static <E extends Comparable<E>> List<E> removeDupes(List<E> list) {
        boolean found = false;
        if (list.size() == 0) {
            return list;
        }
        List<E> newList = new ArrayList<>();
        newList.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < newList.size(); j++) {
                if (list.get(i).compareTo(newList.get(j)) == 0) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                newList.add(list.get(i));
            }
            found = false;
        }
        return newList;
    }
}
