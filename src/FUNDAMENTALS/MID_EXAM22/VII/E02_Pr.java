package FUNDAMENTALS.MID_EXAM22.VII;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_Pr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sugarCubes = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!"Mort".equals(line)) {
            String[] commands = line.split("\\s+");
            String command = commands[0];
            int value = Integer.parseInt(commands[1]);

            if ("Add".equals(command)) {
                sugarCubes.add(value);

            } else if ("Remove".equals(command)) {
                sugarCubes.remove((Object) value);

            } else if ("Replace".equals(command)) {
                int replacementValue = Integer.parseInt(commands[2]);
                int index = sugarCubes.indexOf(value);
                sugarCubes.set(index, replacementValue);

            } else if ("Collapse".equals(command)) {
                sugarCubes.removeIf(sugarCube -> sugarCube < value);

            }

            line = scanner.nextLine();
        }

        printList(sugarCubes);

    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
