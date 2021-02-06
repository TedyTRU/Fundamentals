package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(getMiddleChar(word));

    }

    private static String getMiddleChar(String word) {
        int index = word.length() / 2;
        StringBuilder output = new StringBuilder();

        if (word.length() % 2 == 0) {
            output.append(word.charAt(index - 1));
            output.append(word.charAt(index));

        } else {
            output.append(word.charAt(index));
        }
        return output.toString();
    }
}
