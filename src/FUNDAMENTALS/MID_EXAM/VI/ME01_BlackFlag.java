package FUNDAMENTALS.MID_EXAM.VI;

import java.util.Scanner;

public class ME01_BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int piratingDays = Integer.parseInt(scanner.nextLine());
        int plunderPerDay = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double gain = 0;
        int days = 0;

        while (days < piratingDays) {
            days++;
            double plunder = plunderPerDay;

            if (days % 3 == 0) {
                plunder = plunderPerDay * 1.5;
            }

            gain += plunder;

            if (days % 5 == 0) {
                gain *= 0.7;
            }

        }
        double percentage = gain / expectedPlunder * 100;

        if (gain >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", gain);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }

    }
}
