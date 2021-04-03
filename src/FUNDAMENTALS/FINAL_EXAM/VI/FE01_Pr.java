package FUNDAMENTALS.FINAL_EXAM.VI;

import java.security.KeyStore;
import java.util.Scanner;

public class FE01_Pr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        //StringBuilder changedText = new StringBuilder(text);
        String commands = scanner.nextLine();

        while (!"End".equals(commands)) {
            String[] tokens = commands.split("\\s+");
            String command = tokens[0];

            if ("Translate".equals(command)) {
                String symbol = tokens[1].trim();
                String replacement = tokens[2].trim();

                text = text.replaceAll(symbol, replacement);
                System.out.println(text);

            } else if ("Includes".equals(command)) {
                String string = tokens[1].trim();
                if (text.contains(string)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if ("Start".equals(command)) {
                String string = tokens[1].trim();
                if (text.indexOf(string) == 0) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if ("Lowercase".equals(command)) {
                text = text.toLowerCase();
                System.out.println(text);

            } else if ("FindIndex".equals(command)) {
                String symbol = tokens[1].trim();
                int index = text.lastIndexOf(symbol);
                System.out.println(index);

            } else if ("Remove".equals(command)) {
                int index = Integer.parseInt(tokens[1]);
                int count = Integer.parseInt(tokens[2]);
                int endIndex = index + count;

                StringBuilder changedText = new StringBuilder(text);
                changedText.replace(index, endIndex, "");
                text = changedText.toString();
                System.out.println(text);
            }

            commands = scanner.nextLine();
        }

    }
}
