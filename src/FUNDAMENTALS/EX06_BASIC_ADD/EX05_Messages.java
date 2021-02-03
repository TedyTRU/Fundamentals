package FUNDAMENTALS.EX06_BASIC_ADD;

import java.util.Scanner;

public class EX05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int inputNum = Integer.parseInt(scanner.nextLine());

            //String numberAsString = "" + letter;
            String numberAsString = Integer.toString(inputNum);
            int digitCount = numberAsString.length();
            int mainDigit = inputNum % 10;
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }
            int letterIndex = offset + digitCount - 1;

            if (inputNum == 0) {
                System.out.print(" ");

            } else {
                System.out.print((char) (letterIndex + 97));
            }
        }
    }
}
