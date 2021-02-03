package FUNDAMENTALS.LAB08_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class L08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        if (line.equals(line.toUpperCase())) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }

    }
}
