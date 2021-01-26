package FUNDAMENTALS.LAB11_ARRAYS;

import java.util.Scanner;

public class L03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        int sumEvenNumbers = 0;

        for (int i = 0; i < line.length; i++) {
            int digit = Integer.parseInt(line[i]);

            if (digit % 2 == 0) {
                sumEvenNumbers += digit;
            }
        }
        System.out.println(sumEvenNumbers);
    }
}
