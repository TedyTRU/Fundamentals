package FUNDAMENTALS.LAB08_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class L02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double pounds = Double.parseDouble(scanner.nextLine());
//        double USD = 1.31 * pounds;
//        System.out.printf("%.3f", USD);

        int cents = scanner.nextInt();
        double convertedCents = cents * 1.31;
        int wholeDollars = (int) (convertedCents / 100);
        int wholeCents = (int) (convertedCents % 100);

        System.out.printf("%02d.%02d", wholeDollars, wholeCents);

        System.out.println(0.1 + 0.2);
        System.out.println(3 * 0.3);

    }
}
