package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import java.util.Scanner;

public class E02_CharacterMultiplier_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        String firstString = line[0];
        String secondString = line[1];

        int minLength = Math.min(firstString.length(), secondString.length());
        int maxLength = Math.max(firstString.length(), secondString.length());
        int sum = 0;

        for (int i = 0; i < maxLength; i++) {

            if (i < minLength) {
                sum += firstString.charAt(i) * secondString.charAt(i);

            } else if (firstString.length() == maxLength) {
                sum += firstString.charAt(i);

            } else {
                sum += secondString.charAt(i);

            }
        }
        System.out.println(sum);
    }
}
