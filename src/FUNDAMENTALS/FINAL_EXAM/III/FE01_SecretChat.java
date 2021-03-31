package FUNDAMENTALS.FINAL_EXAM.III;

import java.util.Scanner;

public class FE01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder(concealedMessage);

        while (!"Reveal".equals(concealedMessage)) {
            String command = concealedMessage.split(":\\|:")[0];

            if ("InsertSpace".equals(command)) {
                int index = Integer.parseInt(concealedMessage.split(":\\|:")[1]);
                message.insert(index, " ");
                System.out.println(message.toString());

            } else if ("Reverse".equals(command)) {
                String substring = concealedMessage.split(":\\|:")[1];

                if (message.toString().contains(substring)) {
                    StringBuilder reversedSubstring = new StringBuilder(substring).reverse();
                    int index = message.indexOf(substring);
                    int endIndex = index + substring.length();
                    message.delete(index, endIndex);
                    message.append(reversedSubstring);
                    System.out.println(message);

                } else {
                    System.out.println("error");
                }

            } else if ("ChangeAll".equals(command)) {
                String substring = concealedMessage.split(":\\|:")[1];
                String replacement = concealedMessage.split(":\\|:")[2];

                if (message.toString().contains(substring)) {
                    int index = message.indexOf(substring);
                    int endIndex = index + substring.length();

                    while (index != -1) {
                        message.replace(index, endIndex, replacement);
                        index = message.indexOf(substring);
                        endIndex = index + substring.length();
                    }
                }
                System.out.println(message.toString());
            }

            concealedMessage = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", message.toString());

    }
}
