package FUNDAMENTALS.LAB11_ARRAYS;

import java.util.Scanner;

public class L02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());
        int[] arrayOfNumbers = new int[countNumbers];

        for (int i = 0; i < countNumbers; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            arrayOfNumbers[i] = num;
        }
        for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayOfNumbers[i] + " ");
        }

    }
}
