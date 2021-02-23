package FUNDAMENTALS.MID_EXAM.IV;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ME02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!+")).collect(Collectors.toList());
        //String[] shoppingList = scanner.nextLine().split("!+");
        String commands = scanner.nextLine();

        while (!"Go Shopping!".equals(commands)) {
            String command = commands.split("\\s+")[0];
            String item = commands.split("\\s+")[1];

            if (command.equals("Urgent")) {
                if (!shoppingList.contains(item)) {
                    shoppingList.add(0, item);
                }

            } else if (command.equals("Unnecessary")) {

                shoppingList.remove(item);

            } else if (command.equals("Correct")) {
                String newItem = commands.split("\\s+")[2];
                if (shoppingList.contains(item)) {
                    int index = shoppingList.indexOf(item);
                    shoppingList.set(index, newItem);
                }

            } else if (command.equals("Rearrange")) {
                if (shoppingList.contains(item)) {
                    shoppingList.remove(item);

                    shoppingList.add(item);
                }
            }

            commands = scanner.nextLine();
        }

        printList(shoppingList);

    }

    private static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }

    }
}
