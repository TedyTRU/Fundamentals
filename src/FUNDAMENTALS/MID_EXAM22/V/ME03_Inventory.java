package FUNDAMENTALS.MID_EXAM22.V;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ME03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> collectingItems = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!"Craft!".equals(line)) {
            String[] commands = line.split(" - ");
            String command = commands[0];
            String item = commands[1];

            if ("Collect".equals(command)) {
                if (!collectingItems.contains(item)) {
                    collectingItems.add(item);
                }

            } else if ("Drop".equals(command)) {
                collectingItems.remove(item);

            } else if ("Combine Items".equals(command)) {
                String oldItem = item.split(":")[0];
                String newItem = item.split(":")[1];

                if (collectingItems.contains(oldItem)) {
                    int index = collectingItems.indexOf(oldItem) + 1;
                    collectingItems.add(index, newItem);
                }

            } else if ("Renew".equals(command)) {
                if (collectingItems.contains(item)) {
                    collectingItems.remove(item);
                    collectingItems.add(item);
                }

            }

            line = scanner.nextLine();
        }

        System.out.println(collectingItems.toString().replaceAll("[\\]\\[]", ""));
    }
}
