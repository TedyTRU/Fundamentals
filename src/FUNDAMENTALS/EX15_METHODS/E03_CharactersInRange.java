package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstChar = scanner.nextLine();
        String secondChar = scanner.nextLine();

        System.out.println(printCharacters(firstChar, secondChar));
    }

    private static String printCharacters(String firstChar, String secondChar) {
        StringBuilder lineOfChars = new StringBuilder();
        int a = firstChar.charAt(0);
        int b = secondChar.charAt(0);

        if (firstChar.charAt(0) > secondChar.charAt(0)) {
            a = secondChar.charAt(0);
            b = firstChar.charAt(0);
        }

        for (int i = a + 1; i < b; i++) {
            lineOfChars.append((char)i + " ");
        }
        return lineOfChars.toString();
    }
}
