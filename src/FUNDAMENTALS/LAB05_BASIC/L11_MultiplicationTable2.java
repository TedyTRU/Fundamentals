package FUNDAMENTALS.LAB05_BASIC;

import java.util.Scanner;

public class L11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10) {

            System.out.printf("%d X %d = %d", n, multiplier, (n*multiplier));

        } else {

            for (int i = multiplier; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, (n * i));
            }

        }
    }
}
