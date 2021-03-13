package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import java.util.Scanner;

public class E02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        String firstString = line[0];
        String secondString = line[1];

        int n = Math.min(firstString.length(), secondString.length());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += firstString.charAt(i) * secondString.charAt(i);
        }

        if (secondString.length() > firstString.length()) {
            sum = addToSum(secondString, n, sum);

        } else if (firstString.length() > secondString.length()) {
            sum = addToSum(firstString, n, sum);
        }

        System.out.println(sum);
    }

    private static int addToSum(String secondString, int n, int sum) {
        for (int i = n; i < secondString.length(); i++) {
            sum += secondString.charAt(i);
        }
        return sum;
    }
}
