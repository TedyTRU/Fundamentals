package FUNDAMENTALS.EX18_LISTS;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(6);

        int element = 5;

        while (list.contains(element)) {
            list.remove((Object)element);
        }

        printList(list);
    }
    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

}
