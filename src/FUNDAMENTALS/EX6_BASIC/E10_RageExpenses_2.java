package FUNDAMENTALS.EX6_BASIC;

import java.util.Scanner;

public class E10_RageExpenses_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = 0;

        double headsetExpenses = lostGamesCount / 2 * headsetPrice;
        double mouseExpenses = lostGamesCount / 3 * mousePrice;
        double keyboardExpenses = lostGamesCount / 6 * keyboardPrice;
        double displayExpenses = lostGamesCount / 12 * displayPrice;

        expenses = headsetExpenses + mouseExpenses + keyboardExpenses + displayExpenses;

        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
