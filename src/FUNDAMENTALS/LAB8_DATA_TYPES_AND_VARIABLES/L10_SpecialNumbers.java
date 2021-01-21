package FUNDAMENTALS.LAB8_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class L10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int digit = i;
            int sum = 0;

            while (digit > 0) {
                sum += digit % 10;
                digit /= 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }
    }
}
