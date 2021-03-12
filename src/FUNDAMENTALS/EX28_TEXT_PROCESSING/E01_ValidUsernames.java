package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import java.util.Scanner;

public class E01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");

        for (String name : userNames) {
            boolean isValid = true;

            if (name.length() < 3 || name.length() > 16) {
                continue;
            }

            for (int i = 0; i < name.length(); i++) {
                char symbol = name.charAt(i);
                if (!Character.isLetterOrDigit(symbol)
                        && symbol != 45
                        && symbol != 95) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println(name);
            }
        }

    }
}
