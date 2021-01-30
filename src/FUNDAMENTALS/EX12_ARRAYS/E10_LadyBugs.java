package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E10_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] ladybugsIndex = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] ladybugs = new int[fieldSize];

        for (int i = 0; i < ladybugsIndex.length; i++) {
            if (ladybugsIndex[i] >= 0 && ladybugsIndex[i] < fieldSize) {
                ladybugs[ladybugsIndex[i]] = 1;
            }

        }
        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] movement = command.split(" ");
            int index = Integer.parseInt(movement[0]);
            int fly = Integer.parseInt(movement[2]);
            String direction = movement[1];

            if (index < 0 || index >= ladybugs.length || ladybugs[index] != 1) {
                command = scanner.nextLine();
                continue;
            }
            ladybugs[index] = 0;

            if ("right".equals(direction)) {
                index += fly;

                while (index < ladybugs.length && ladybugs[index] == 1) {
                    index += fly;
                }
                if (index < ladybugs.length) {
                    ladybugs[index] = 1;
                }

            } else if ("left".equals(direction)) {
                index -= fly;

                while (index >= 0 && ladybugs[index] == 1) {
                    index -= fly;
                }
                if (index >= 0) {
                    ladybugs[index] = 1;
                }

            }


            command = scanner.nextLine();
        }
        for (int output : ladybugs) {
            System.out.print(output + " ");
        }
    }
}
