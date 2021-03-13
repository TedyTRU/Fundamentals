package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import java.util.Scanner;

public class E04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = (char) (text.charAt(i) + 3);
            encrypted.append(symbol);
        }

        System.out.println(encrypted.toString());

    }
}
