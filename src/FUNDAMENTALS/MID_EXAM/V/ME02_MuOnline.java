package FUNDAMENTALS.MID_EXAM.V;

import java.util.Arrays;
import java.util.Scanner;

public class ME02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dungeonsRooms = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i < dungeonsRooms.length; i++) {
            String[] room = dungeonsRooms[i].split("\\s+");
            String command = room[0];
            int number = Integer.parseInt(room[1]);

            if (command.equals("potion")) {
                if (health + number > 100) {
                    number = 100 - health;
                    health = 100;
                } else {
                    health += number;
                }
                System.out.printf("You healed for %d hp.%n", number);
                System.out.printf("Current health: %d hp.%n", health);

            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);

            } else {
                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i + 1);
                    return;
                }
            }
        }

        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", bitcoins, health);

    }
}
