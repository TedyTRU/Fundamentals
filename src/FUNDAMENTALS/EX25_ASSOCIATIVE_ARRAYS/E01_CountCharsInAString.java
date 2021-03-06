package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<Character, Integer> charsCount = new LinkedHashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);

            if (letter != ' ') {
                if (!charsCount.containsKey(letter)) {
                    charsCount.put(letter, 1);
                } else {
                    int occurrences = charsCount.get(letter) + 1;
                    charsCount.put(letter, occurrences);
                }
            }

        }
        for (Map.Entry<Character, Integer> entry : charsCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
