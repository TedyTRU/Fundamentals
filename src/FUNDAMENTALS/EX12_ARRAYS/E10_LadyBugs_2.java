package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E10_LadyBugs_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] ladyBugs = new int[fieldSize];

        int[] lineOfBugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        for (int i = 0; i < lineOfBugs.length; i++) {
            int index = lineOfBugs[i];
            if (index >= 0 && index < ladyBugs.length) {
                ladyBugs[index] = 1;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] fly = command.split(" ");
            int index = Integer.parseInt(fly[0]);
            String direction = fly[1];
            int flyLength = Integer.parseInt(fly[2]);

            if (direction.equals("right")) {
                if (index >= 0 && index < ladyBugs.length) {
                    if (ladyBugs[index] == 1) {
                        ladyBugs[index] = 0;
                        int movement = index + flyLength;
                        for (int i = movement; i < ladyBugs.length; i += flyLength) {
                            if (ladyBugs[i] == 0) {
                                ladyBugs[i] = 1;
                                break;
                            }
                        }
                    }
                }


            } else if (direction.equals("left")) {
                if (index >= 0 && index < ladyBugs.length) {
                    if (ladyBugs[index] == 1) {
                        ladyBugs[index] = 0;
                        int movement = index - flyLength;
                        for (int i = movement; i >= 0; i -= flyLength) {
                            if (ladyBugs[i] == 0) {
                                ladyBugs[i] = 1;
                                break;
                            }
                        }
                    }
                }
            }


            command = scanner.nextLine();
        }

        for (int ladyBug : ladyBugs) {
            System.out.print(ladyBug + " ");
        }

    }
}
