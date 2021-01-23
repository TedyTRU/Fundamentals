package FUNDAMENTALS.EX09_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class E04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < numberOfLines; i++) {
            //String character = scanner.nextLine();
            //sum += character.charAt(0);

            char character = scanner.nextLine().charAt(0);
            sum += character;

        }
        System.out.printf("The sum equals: %d", sum);
    }
}
