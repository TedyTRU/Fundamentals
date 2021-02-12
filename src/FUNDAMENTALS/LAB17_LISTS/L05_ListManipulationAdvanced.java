package FUNDAMENTALS.LAB17_LISTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!"end".equals(line)) {
            String[] commandArr = line.split("\\s+");
            String command = commandArr[0];

            if ("Contains".equals(command)) {
                int number = Integer.parseInt(commandArr[1]);
                containsNumber(list, number);

            } else if ("Print".equals(command)) {
                String evenOrOdd = commandArr[1];
                printEvenOrOdd(list, evenOrOdd);

            } else if ("Get".equals(command)) {
                getSum(list);

            } else if ("Filter".equals(command)) {
                String condition = commandArr[1];
                int number = Integer.parseInt(commandArr[2]);
                filterNumber(list, condition, number);
            }

            line = scanner.nextLine();
        }

    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static void filterNumber(List<Integer> list, String condition, int number) {
        List<Integer> filtered = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            switch (condition) {
                case "<":
                    if (list.get(i) < number) {
                        filtered.add(list.get(i));
                    }
                    break;
                case ">":
                    if (list.get(i) > number) {
                        filtered.add(list.get(i));
                    }
                    break;
                case ">=":
                    if (list.get(i) >= number) {
                        filtered.add(list.get(i));
                    }
                    break;
                case "<=":
                    if (list.get(i) <= number) {
                        filtered.add(list.get(i));
                    }
                    break;
            }
        }
        printList(filtered);
    }

    private static void getSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }

    private static void printEvenOrOdd(List<Integer> list, String evenOrOdd) {
        List<Integer> evenOdd = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (evenOrOdd.equals("even")) {
                if (list.get(i) % 2 == 0) {
                    evenOdd.add(list.get(i));
                }
            } else {
                if (list.get(i) % 2 != 0) {
                    evenOdd.add(list.get(i));
                }
            }
        }
        printList(evenOdd);
    }

    private static void containsNumber(List<Integer> list, int number) {
        boolean itContains = false;
        List<Integer> contains = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(number)) {
                itContains = true;
                break;
            }
        }
        if (itContains) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
