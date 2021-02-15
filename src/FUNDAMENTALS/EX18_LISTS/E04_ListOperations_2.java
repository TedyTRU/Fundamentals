package FUNDAMENTALS.EX18_LISTS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04_ListOperations_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!"End".equals(line)) {
            String[] commands = line.split("\\s+");
            String command = commands[0];

            if ("Add".equals(command)) {
                int number = Integer.parseInt(commands[1]);
                numbers.add(number);

            } else if ("Insert".equals(command)) {
                int number = Integer.parseInt(commands[1]);
                int index = Integer.parseInt(commands[2]);
                if (index < 0 || index > numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(index, number);
                }

            } else if ("Remove".equals(command)) {
                int index = Integer.parseInt(commands[1]);
                if (index < 0 || index > numbers.size()) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(index);
                }

            } else if ("Shift".equals(command)) {
                String leftORight = commands[1];
                int count = Integer.parseInt(commands[2]);

                if (leftORight.equals("left")) {
                    Collections.rotate(numbers, -count);
                } else if (leftORight.equals("right")) {
                    Collections.rotate(numbers, count);
                }

            }

            line = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }

}