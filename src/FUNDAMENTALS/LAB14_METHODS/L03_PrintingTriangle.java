package FUNDAMENTALS.LAB14_METHODS;

import java.util.Scanner;

public class L03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printLineOfNumbers(i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printLineOfNumbers(i);
        }

    }

    private static void printLineOfNumbers (int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
