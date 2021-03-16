package FUNDAMENTALS.EX28_TEXT_PROCESSING_ADD;

import java.util.Scanner;

public class E04_MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] message = scanner.nextLine().split(" ");

        StringBuilder translatedMessage = new StringBuilder();

        for (String s : message) {
            if (s.equals("|")) {
                translatedMessage.append(" ");
            } else {
                for (int i = 0; i < morseCode.length; i++) {
                    if (s.equals(morseCode[i])) {
                        char letter = (char) (i + 65);
                        translatedMessage.append(letter);
                        break;
                    }
                }
            }
        }

        System.out.println(translatedMessage.toString());

    }
}
