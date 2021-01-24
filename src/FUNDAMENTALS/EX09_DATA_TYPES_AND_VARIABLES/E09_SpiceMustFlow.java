package FUNDAMENTALS.EX09_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class E09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalInStorage = 0;
        int days = 0;

        while (startingYield >= 100) {
            int storage = startingYield;

            storage -= 26;
            totalInStorage += storage;
            startingYield -= 10;
            days++;
        }

        if (totalInStorage > 26) {
            totalInStorage -= 26;
        } else {
            totalInStorage = 0;
        }

        System.out.println(days);
        System.out.println(totalInStorage);
    }
}
