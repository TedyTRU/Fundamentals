package FUNDAMENTALS.LAB27_TEXT_PROCESSING;

import java.util.Scanner;

public class L04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            int n = word.length();
//            StringBuilder replacement = new StringBuilder();
//            for (int i = 0; i < n; i++) {
//                replacement.append("*");
//            }
            //String replacement = repeatStr("*", word.length());

            String replacement = "*";
            replacement = replacement.repeat(n);
            text = text.replace(word, replacement);
        }

        System.out.println(text);

    }
}
