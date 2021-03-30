package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS_ADD;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>
                (Map.of(6, "D", 4, "F", 1, "E", 3, "B", 2, "C", 5, "A"));

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(a -> System.out.printf("%d : %s%n", a.getKey(), a.getValue()));

        System.out.println("-----");

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(a -> System.out.printf("%d : %s%n", a.getKey(), a.getValue()));

        System.out.println("-----");

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(a -> System.out.printf("%d : %s%n", a.getKey(), a.getValue()));

        System.out.println("-----");

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .filter(a -> a.getKey() % 2 != 0)
                .forEach(a -> System.out.printf("%d : %s%n", a.getKey(), a.getValue()));

    }
}
