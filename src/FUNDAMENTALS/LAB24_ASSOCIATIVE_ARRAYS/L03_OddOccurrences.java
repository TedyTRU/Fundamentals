package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.*;

public class L03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        Map<String, Integer> sequence = new LinkedHashMap<>();

        for (String word : line) {
            Integer occurrences = sequence.get(word.toLowerCase());
            if (occurrences == null) {
                occurrences = 0;
            }
            sequence.put(word.toLowerCase(), occurrences + 1);
        }

        List<String> oddOccurrences = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : sequence.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddOccurrences.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", oddOccurrences));
    }
}
