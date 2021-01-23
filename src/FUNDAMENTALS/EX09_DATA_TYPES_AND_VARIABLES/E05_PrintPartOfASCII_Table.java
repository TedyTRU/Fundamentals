package FUNDAMENTALS.EX09_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class E05_PrintPartOfASCII_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstIndex = Integer.parseInt(scanner.nextLine());
        int secondIndex = Integer.parseInt(scanner.nextLine());

        for (int i = firstIndex; i <= secondIndex; i++) {

            char symbol = (char) i;

            System.out.print(symbol + " ");
        }

    }
}
