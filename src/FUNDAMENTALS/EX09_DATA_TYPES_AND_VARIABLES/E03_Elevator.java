package FUNDAMENTALS.EX09_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class E03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil((double) people / capacity);

        System.out.println(courses);
    }
}
