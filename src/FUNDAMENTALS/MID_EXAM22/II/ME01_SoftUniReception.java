package FUNDAMENTALS.MID_EXAM22.II;

import java.util.Scanner;

public class ME01_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

//        int efficiencyPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
//        double hours = Math.ceil((double) students / efficiencyPerHour);
//        double breaks = Math.floor(hours / 3);
//
//        if (hours % 3 != 0) {
//            hours += breaks;
//        }

        int efficiencyPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        int hours = 0;
        while (students > 0) {
            hours++;

            if (hours % 4 == 0) {
                hours++;
            }

            students -= efficiencyPerHour;
        }

        System.out.printf("Time needed: %dh.", hours);

    }
}
