package FUNDAMENTALS.MID_EXAM.VII;

import java.util.Scanner;

public class E01_Pr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfFlour = Double.parseDouble(scanner.nextLine());
        double priceOfEgg = Double.parseDouble(scanner.nextLine());
        double priceOfApron = Double.parseDouble(scanner.nextLine());

        double aprons = Math.ceil(1.2 * students) * priceOfApron;
        int freePackages = students / 5;
        double setPerStudent = (priceOfEgg * 10 * students) + aprons + (priceOfFlour * (students - freePackages));

        if (setPerStudent <= budget) {
            System.out.printf("Items purchased for %.2f$.", setPerStudent);
        } else {
            System.out.printf("%.2f$ more needed.", (setPerStudent - budget));
        }

    }
}
