package FUNDAMENTALS.EX28_TEXT_PROCESSING_ADD;

import java.util.Scanner;

public class E03_TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] key = scanner.nextLine().split(" ");
        String line = scanner.nextLine();

        while (!"find".equals(line)) {
            StringBuilder message = new StringBuilder();
            int keyIndex = 0;

            for (int i = 0; i < line.length(); i++) {

                if (keyIndex == key.length) {
                    keyIndex = 0;
                }
                char symbol = (char) (line.charAt(i) - Integer.parseInt(key[keyIndex]));
                message.append(symbol);
                keyIndex++;
            }
            int startIndexOfType = message.indexOf("&") + 1;
            int lastIndexOfType = message.lastIndexOf("&");
            int startIndexOfCoordinates = message.indexOf("<") + 1;
            int lastIndexOfCoordinates = message.indexOf(">");

            String type = message.substring(startIndexOfType, lastIndexOfType);
            String coordinates = message.substring(startIndexOfCoordinates, lastIndexOfCoordinates);

            System.out.printf("Found %s at %s%n", type, coordinates);

            line = scanner.nextLine();
        }

    }
}
