package FUNDAMENTALS.EX06_BASIC;

import java.util.Scanner;

public class E06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int n = number;
        while (n > 0) {
            int digit = n % 10;

            int factorial = 1;
            while (digit > 1) {
                factorial *= digit;
                digit -= 1;
            }
            sum += factorial;

            n /= 10;
        }
        if (sum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

