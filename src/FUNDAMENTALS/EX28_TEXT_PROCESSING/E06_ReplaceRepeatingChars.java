package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import java.util.Scanner;

public class E06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder replaced = new StringBuilder();

        for (int i = 0; i < text.length() - 1; i++) {

            if (text.charAt(i) != text.charAt(i + 1)) {
                replaced.append(text.charAt(i));
            }
        }
        replaced.append(text.charAt(text.length() - 1));
        System.out.println(replaced.toString());

    }
}
