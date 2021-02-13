package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (topNumber(i)) {
                System.out.println(i);
            }

        }

    }

    private static boolean topNumber(int number) {
        if (sumOfDigitsDivisibleByEight(number) && holdOddDigit(number)) {
            return true;
        }
        return false;
    }

    private static boolean holdOddDigit(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    private static boolean sumOfDigitsDivisibleByEight(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        }
        return false;
    }
}
