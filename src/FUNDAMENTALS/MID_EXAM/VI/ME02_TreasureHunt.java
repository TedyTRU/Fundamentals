package FUNDAMENTALS.MID_EXAM.VI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ME02_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());
        String lines = scanner.nextLine();

        while (!"Yohoho!".equals(lines)) {
            String command = lines.split("\\s+")[0];

            if ("Loot".equals(command)) {
                int index = lines.split("\\s+").length;

                for (int i = 1; i < index; i++) {
                    String item = lines.split("\\s+")[i];

                    if (!treasureChest.contains(item)) {
                        treasureChest.add(0, item);
                    }
                }

            } else if ("Drop".equals(command)) {
                int index = Integer.parseInt(lines.split("\\s+")[1]);

                if (index >= 0 && index < treasureChest.size()) {
                    String loot = treasureChest.get(index);
                    treasureChest.remove(loot);
                    treasureChest.add(loot);
                }

            } else if ("Steal".equals(command)) {
                int count = Integer.parseInt(lines.split("\\s+")[1]);
                List<String> stolenItems = new ArrayList<>();

                if (count > treasureChest.size()) {
                    count = treasureChest.size();
                }

                for (int i = 0; i < count; i++) {
                    int index = treasureChest.size() - 1;
                    stolenItems.add(treasureChest.get(index));
                    treasureChest.remove(index);
                }
                printList(stolenItems);
            }

            lines = scanner.nextLine();
        }

        if (treasureChest.size() == 0) {
            System.out.println("Failed treasure hunt.");

        } else {
            double sumOfLengths = 0;

            for (String s : treasureChest) {
                sumOfLengths += s.length();
            }

            double gain = sumOfLengths / (treasureChest.size());
            System.out.printf("Average treasure gain: %.2f pirate credits.", gain);
        }

    }

    private static void printList(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

}
