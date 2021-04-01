package FUNDAMENTALS.FINAL_EXAM.III;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        //String regex = "(@|#)(?<word1>[A-Za-z]{3,})\\1(@|#)(?<word2>[A-Za-z]{3,})\\1"; ne
        //String regex = "([@#])(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";
        String regex = "(@|#)(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        int count = 0;
        List<String> mirroredWords = new ArrayList<>();

        while (matcher.find()) {
            count++;
            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");
            StringBuilder mirroredWord = new StringBuilder();

            for (int i = word1.length() - 1; i >= 0; i--) {
                char symbol = word1.charAt(i);
                mirroredWord.append(symbol);
            }
            if (mirroredWord.toString().equals(word2)) {
                mirroredWords.add(word1 + " <=> " + word2);
            }
        }

        if (count == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", count);
        }

        if (mirroredWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");

            System.out.println(mirroredWords.toString().replaceAll("[\\[\\]]", ""));
        }
    }
}
