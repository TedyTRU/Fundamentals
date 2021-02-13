package FUNDAMENTALS.EX18_LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        while (numOfLines > 0) {
            String[] commands = scanner.nextLine().split("\\s+");
            String name = commands[0];
            String isOrNot = commands[2];

           switch (isOrNot) {
               case "going!":
                   if (!names.contains(name)) {
                       names.add(name);
                   } else {
                       System.out.printf("%s is already in the list!%n", name);
                   }
                   break;

               case "not":
                   if (names.contains(name)) {
                       names.remove(name);
                   } else {
                       System.out.printf("%s is not in the list!%n", name);
                   }
                   break;
           }

            numOfLines--;
        }

        for (String output : names) {
            System.out.println(output);
        }

    }
}
