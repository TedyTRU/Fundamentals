package FUNDAMENTALS.LAB27_TEXT_PROCESSING;

import java.util.Scanner;

public class L02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        StringBuilder repeatedWord = new StringBuilder();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                repeatedWord.append(word);
            }
        }

        System.out.println(repeatedWord);

    }
}
