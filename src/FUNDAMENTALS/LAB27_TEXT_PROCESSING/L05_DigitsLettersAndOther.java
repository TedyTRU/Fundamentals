package FUNDAMENTALS.LAB27_TEXT_PROCESSING;

import java.util.Scanner;

public class L05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {

            if (Character.isDigit(line.charAt(i))) {
                digits.append(line.charAt(i));
            } else if (Character.isLetter(line.charAt(i))) {
                letters.append(line.charAt(i));
            } else {
                others.append(line.charAt(i));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);

    }
}
