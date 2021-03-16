package FUNDAMENTALS.EX28_TEXT_PROCESSING_ADD;

import java.util.Scanner;

public class E04_MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] message = scanner.nextLine().split(" ");

        StringBuilder translatedMessage = new StringBuilder();

        for (int i = 0; i < message.length; i++) {
            String letter = message[i];
            char translatedLetter = 65;

            if (letter.equals("|")) {
                translatedLetter = ' ';
            } else {
                for (int j = 0; j < morseCode.length; j++) {
                    if (letter.equals(morseCode[j])) {
                        translatedLetter += j;
                    }
                }
            }
            translatedMessage.append(translatedLetter);

        }

        System.out.println(translatedMessage.toString());

    }
}
