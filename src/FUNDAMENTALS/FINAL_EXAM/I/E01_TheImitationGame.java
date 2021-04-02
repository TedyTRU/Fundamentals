package FUNDAMENTALS.FINAL_EXAM.I;

import java.util.Scanner;

public class E01_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        String commands = scanner.nextLine();
        StringBuilder message = new StringBuilder(encryptedMessage);

        while (!"Decode".equals(commands)) {
            String command = commands.split("\\|")[0];

            if ("Move".equals(command)) {
                int numberOfLetters = Integer.parseInt(commands.split("\\|")[1]);
                for (int i = 0; i < numberOfLetters; i++) {
                    char symbol = message.charAt(0);
                    message.append(symbol);
                    message.deleteCharAt(0);
                }

            } else if ("Insert".equals(command)) {
                int index = Integer.parseInt(commands.split("\\|")[1]);
                String value = commands.split("\\|")[2];

                if (index >= 0 && index <= message.length()) {
                    message.insert(index, value);
                }

            } else if ("ChangeAll".equals(command)) {
                String substring = commands.split("\\|")[1];
                String replacement = commands.split("\\|")[2];
                int index = message.indexOf(substring);
                int endIndex = index + substring.length();

                while (index != -1) {
                    message.replace(index, endIndex, replacement);

                    index = message.indexOf(substring);
                    endIndex = index + substring.length();
                }
            }

            commands = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);

    }
}
