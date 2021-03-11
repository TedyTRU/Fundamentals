package FUNDAMENTALS.LAB27_TEXT_PROCESSING;

import java.util.Scanner;

public class L01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!"end".equals(word)) {

            StringBuilder reversed = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed.append(word.charAt(i));
            }

            System.out.printf("%s = %s%n", word, reversed);
            word = scanner.nextLine();
        }

    }
}
