package FUNDAMENTALS.EX18_LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!"end".equals(line)) {
            String[] commands = line.split("\\s+");
            String command = commands[0];
            int element = Integer.parseInt(commands[1]);

            if ("Delete".equals(command)) {
                while (list.contains(element)) {
                    //list.remove((Object) element);
                    list.removeAll(Arrays.asList(5));
                }

            } else if ("Insert".equals(command)) {
                int position = Integer.parseInt(commands[2]);
                list.add(position, element);
            }

            line = scanner.nextLine();
        }
        printList(list);
    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

}
