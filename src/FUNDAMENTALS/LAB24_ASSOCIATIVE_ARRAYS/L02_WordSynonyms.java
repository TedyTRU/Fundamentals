package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.*;

public class L02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (words.containsKey(word)) {
                words.get(word).add(synonym);
            } else {
                words.put(word, new ArrayList<>());
                words.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString().replaceAll("[\\]\\[]", ""));
        }

    }
}
