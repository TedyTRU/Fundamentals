package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex3 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("cats");
        words.add("budnonethewiser");
        words.add("dog");
        words.add("orange");
        words.add("apple");

//        Collections.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

        Collections.sort(words, ((o1, o2) -> Integer.compare(o1.length(), o2.length())));








//        List<String> filtered = new ArrayList<>();
//        for (String word : words) {
//            if (word.endsWith("e")) {
//                filtered.add(word);
//            }
//        }





//        Stream<String> stream = words.stream();
//        stream.filter(w -> w.endsWith("e"));
//        List<String> filtered = stream.collect(Collectors.toList());

        List<String> filtered = words.stream()
                .filter(w -> w.endsWith("e"))
                .filter(w -> w.length() <= 5)
                .map(w -> w.toUpperCase())
                .sorted((a, b) -> a.compareTo(b))
                .limit(3)
                .collect(Collectors.toList());

        String[] filteredArray = filtered.toArray(new String[filtered.size()]);

        System.out.println(String.join(", ", filtered));
    }
}
