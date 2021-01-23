package FUNDAMENTALS.EX09_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class E02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (integer > 0) {
            int digit = integer % 10;
            sum += digit;
            integer /= 10;
        }
        System.out.println(sum);
    }
}
