package FUNDAMENTALS.LAB14_METHODS;

import java.util.Scanner;

public class L07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(word, count));

    }

    private static String repeatString(String word, int count) {
        StringBuilder repeatedWord = new StringBuilder();
        for (int i = 0; i < count; i++) {
            repeatedWord.append(word);
        }
        return repeatedWord.toString();
    }
}
