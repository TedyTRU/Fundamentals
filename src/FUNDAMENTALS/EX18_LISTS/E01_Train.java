package FUNDAMENTALS.EX18_LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] line = command.split("\\s+");

            if (line[0].equals("Add")) {
                int passengers = Integer.parseInt(line[1]);
                wagons.add(passengers);

            } else {
                int passengers = Integer.parseInt(command);

                for (int i = 0; i < wagons.size(); i++) {
                    int temp = wagons.get(i) + passengers;
                    if (temp <= capacity) {
                        wagons.set(i, temp);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        printList(wagons);
    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

}
