package FUNDAMENTALS.MID_EXAM22.V;

import java.util.Scanner;

public class ME01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int studentAttendances = 0;

        for (int i = 0; i < countOfStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            double bonus = Math.ceil((double) attendances / countOfLectures * (5 + initialBonus));

            if (bonus >= maxBonus) {
                maxBonus = bonus;
                studentAttendances = attendances;
            }

        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", studentAttendances);

    }
}
