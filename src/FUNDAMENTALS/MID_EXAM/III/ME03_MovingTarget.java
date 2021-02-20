package FUNDAMENTALS.MID_EXAM.III;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ME03_MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");
            String token = tokens[0];
            int index = Integer.parseInt(tokens[1]);
            int value = Integer.parseInt(tokens[2]);

            if ("Shoot".equals(token)) {
                if (isValidIndex(targets, index)) {
                    int currentValue = targets.get(index);
                    targets.set(index, (currentValue - value));
                    if (targets.get(index) <= 0) {
                        targets.remove(index);
                    }
                }

            } else if ("Add".equals(token)) {
                if (isValidIndex(targets, index)) {
                    targets.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if ("Strike".equals(token)) {
                int firstIndex = index - value;
                int lastIndex = index + value;

                if (isValidIndex(targets, index) && isValidIndex(targets, lastIndex) &&
                        isValidIndex(targets, firstIndex)) {

                    targets.subList(firstIndex, lastIndex + 1).clear();

                } else {
                    System.out.println("Strike missed!");
                }

            }

            command = scanner.nextLine();
        }

        printList(targets);

    }

    private static void printList(List<Integer> targets) {
        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }
        }
    }

    private static boolean isValidIndex(List<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            return true;
        }
        return false;
    }

}
