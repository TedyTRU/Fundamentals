package FUNDAMENTALS.LAB8_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class L07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLine = scanner.nextLine().charAt(0);
        char secondLine = scanner.nextLine().charAt(0);
        char thirdLine = scanner.nextLine().charAt(0);

        //System.out.printf("%c %c %c", thirdLine, secondLine, firstLine);
        System.out.println("" + thirdLine + secondLine + firstLine);

    }
}
