package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!ruleForCharacters(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!ruleForConsist(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!ruleForDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (ruleForCharacters(password) && ruleForConsist(password) && ruleForDigits(password)) {
            System.out.println("Password is valid");
        }

    }

    private static boolean ruleForDigits(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            boolean isDigit = Character.isDigit(input.charAt(i));
            if (isDigit) {
                count++;
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean ruleForConsist(String input) {
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            boolean isLetter = Character.isLetter(character);
            boolean isDigit = Character.isDigit(character);

            if (!isDigit && !isLetter) {
                return false;
            }
        }
        return true;
    }

    private static boolean ruleForCharacters(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return  true;
        }
        return false;
    }
}
