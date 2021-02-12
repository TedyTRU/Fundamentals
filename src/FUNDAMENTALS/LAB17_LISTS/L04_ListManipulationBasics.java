package FUNDAMENTALS.LAB17_LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!"end".equals(line)) {
            String[] commandArr = line.split("\\s+");
            String command = commandArr[0];
            int index = Integer.parseInt(commandArr[1]);

            if ("Add".equals(command)) {
                list.add(index);

            } else if ("Remove".equals(command)) {
                list.remove((Object)index);

            } else if ("RemoveAt".equals(command)) {
                list.remove(index);

            } else if ("Insert".equals(command)) {
                int number = Integer.parseInt(commandArr[2]);
                list.add(number, index);
            }

            line = scanner.nextLine();
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
