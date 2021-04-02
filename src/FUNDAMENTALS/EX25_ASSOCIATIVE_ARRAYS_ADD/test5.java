package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS_ADD;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test5 {
    public static void main(String[] args) {

        //Map with value list -> sorting by count of list elements
        Map<String, List<String>> map = new HashMap<>();

        map.put("A", Arrays.asList("6", "5", "4", "3"));
        map.put("B", Arrays.asList("7", "4", "3"));
        map.put("C", Arrays.asList("8", "3"));
        map.put("D", Arrays.asList("9", "2"));
        map.put("E", Arrays.asList("10", "1", "10", "11", "7"));


        map
                .entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                .forEach(pair -> {
                    System.out.println(pair.getKey());
                    pair.getValue().forEach(el -> System.out.println(el));
                    System.out.println("-------");
                });


    }
}
