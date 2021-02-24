package FUNDAMENTALS.MID_EXAM;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < lift.length; i++) {
            int temp = 4 - lift[i];

            if (people >= 4) {
                if (lift[i] < 4) {
                    people -= temp;
                    lift[i] += temp;
                }

            } else if (people >= 0) {
                lift[i] += people;
                if (lift[i] > 4) {
                    lift[i] = 4;
                }
                people -= temp;

            } else {
                break;
            }

        }

        if (people < 0) {
            System.out.println("The lift has empty spots!");
            printArray(lift);

        } else if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            printArray(lift);

        } else {
            printArray(lift);
        }

    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
