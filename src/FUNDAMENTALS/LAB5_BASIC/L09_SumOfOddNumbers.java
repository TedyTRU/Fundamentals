package FUNDAMENTALS.LAB5_BASIC;

import java.util.Scanner;

public class L09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int output = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += output;
            System.out.println(output);
            output += 2;

        }
        System.out.println("Sum: " + sum);
    }
}
