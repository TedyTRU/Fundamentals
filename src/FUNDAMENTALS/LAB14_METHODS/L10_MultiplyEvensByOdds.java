package FUNDAMENTALS.LAB14_METHODS;

import java.util.Scanner;

public class L10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int result = sumOfEvenDigits(number) * sumOfOddDigits(number);

        System.out.println(result);

    }

    private static int sumOfEvenDigits(int num) {
        int sum = 0;
        int number = Math.abs(num);
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return  sum;
    }

    private static int sumOfOddDigits(int num) {
        int sum = 0;
        int number = Math.abs(num);
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
