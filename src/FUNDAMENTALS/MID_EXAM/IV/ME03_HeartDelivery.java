package FUNDAMENTALS.MID_EXAM.IV;

import java.util.Arrays;
import java.util.Scanner;

public class ME03_HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] neighborhood = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        int index = 0;

        while (!"Love!".equals(command)) {
            int length = Integer.parseInt(command.split("\\s+")[1]);
            index += length;

            if (index > neighborhood.length - 1) {
                index = 0;
            }

            int house = neighborhood[index];

            if (house == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);

            } else {
                house -= 2;
                neighborhood[index] = house;
                if (house == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", index);
                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", index);

        int count = 0;
        for (int i : neighborhood) {
            if (i != 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Mission was successful.");

        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }

    }
}
