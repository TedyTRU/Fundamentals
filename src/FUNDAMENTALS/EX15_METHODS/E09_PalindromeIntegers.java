package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            System.out.println(isPalindrome(input));

            input = scanner.nextLine();
        }

    }

    private static boolean isPalindrome(String number) {

        int j = number.length() - 1;
        for (int i = 0; i < number.length() / 2; i++) {

            char forward = number.charAt(i);
            char backward = number.charAt(j);

            if (forward != backward) {
                return false;
            }
            j--;
        }
        return true;
    }
}
