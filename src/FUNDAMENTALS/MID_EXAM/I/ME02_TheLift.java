package FUNDAMENTALS.MID_EXAM.I;

import java.util.Arrays;
import java.util.Scanner;

public class ME02_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < lift.length; i++) {

            int tempPeople = 4 - lift[i];

            if (people >= 4) {
                people -= tempPeople;
                lift[i] += tempPeople;

            } else if (people >= 0) {
                lift[i] += people;

                if (lift[i] > 4) {
                    lift[i] = 4;
                }
                people -= tempPeople;

            } else {
                break;
            }
        }

        if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            printArray(lift);

        } else if (people == 0) {
            printArray(lift);

        } else {
            System.out.println("The lift has empty spots!");
            printArray(lift);
        }

    }

    private static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
