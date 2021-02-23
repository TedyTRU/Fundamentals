package FUNDAMENTALS.MID_EXAM.IV;

import java.util.Scanner;

public class ME01_NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeCapacity = Integer.parseInt(scanner.nextLine());
        int secondEmployeeCapacity = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeCapacity = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());

        int capacityPerHour = firstEmployeeCapacity + secondEmployeeCapacity + thirdEmployeeCapacity;
        int hour = 0;
        int count = 0;

        while (people > 0) {
            hour++;
            count++;
            people -= capacityPerHour;

            if (people <= 0) {
                break;
            }

            if (count % 3 == 0) {
                hour++;
            }

        }

        System.out.printf("Time needed: %dh.", hour);

    }
}
