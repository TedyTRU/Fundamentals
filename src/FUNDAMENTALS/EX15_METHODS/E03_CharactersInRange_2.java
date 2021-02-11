package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E03_CharactersInRange_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);

        printSymbolsInRange(startSymbol, endSymbol);
    }

    private static void printSymbolsInRange(char start, char end) {
        if (start < end) {
            for (int ascii = start + 1; ascii < end; ascii++) {
                System.out.print((char) ascii + " ");
            }
        } else {
            for (int ascii = end + 1; ascii < start; ascii++) {
                System.out.print((char) ascii + " ");
            }
        }
    }
}
