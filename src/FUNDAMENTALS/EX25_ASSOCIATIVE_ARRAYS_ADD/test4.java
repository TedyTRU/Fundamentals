package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS_ADD;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class test4 {
    public static void main(String[] args) {


        //Map<Integer,Integer>
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(6, 4);
        map1.put(4, 5);
        map1.put(1, 6);
        map1.put(3, 2);
        map1.put(2, 3);
        map1.put(5, 1);

        // sorted by asc keys
        map1
                .entrySet()
                .stream()
                .sorted(comparingByKey())
                .forEach(a -> System.out.printf("%d : %d%n", a.getKey(), a.getValue()));
//                .collect(
//                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//                                HashMap::new));

        System.out.println("-------");

        // sorted by desc keys
        map1
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingByKey()))
                .forEach(a -> System.out.printf("%d : %d%n", a.getKey(), a.getValue()));
//                .collect(
//                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//                                HashMap::new));

        System.out.println("-------");

        //sort аsc order of value
        map1
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .forEach(a -> System.out.printf("%d : %d%n", a.getKey(), a.getValue()));
//                .collect(
//                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//                                LinkedHashMap::new));


        System.out.println("-------");

        // sort desc order of value
        map1
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(comparingByValue()))
                .forEach(a -> System.out.printf("%d : %d%n", a.getKey(), a.getValue()));
//                .collect(
//                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//                                LinkedHashMap::new));

    }
}
