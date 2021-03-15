package FUNDAMENTALS.EX28_TEXT_PROCESSING_ADD;

import java.util.Scanner;

public class E02_Ascii_Sumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();

        int max = Math.max(firstChar, secondChar);
        int min = Math.min(firstChar, secondChar);
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > min && text.charAt(i) < max) {
                sum += text.charAt(i);
            }
        }
        System.out.println(sum);

    }
}
