package FUNDAMENTALS.MID_EXAM22.VI;

import java.util.Arrays;
import java.util.Scanner;

public class ME03_ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pirateShip = Arrays.stream(scanner.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
        int[] warship = Arrays.stream(scanner.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String lines = scanner.nextLine();

        while (!"Retire".equals(lines)) {
            String command = lines.split("\\s+")[0];

            if ("Fire".equals(command)) {
                int index = Integer.parseInt(lines.split("\\s+")[1]);
                int damage = Integer.parseInt(lines.split("\\s+")[2]);

                if (IsValidIndex(warship, index)) {
                    int sectionHealth = warship[index] - damage;
                    if (sectionHealth > 0) {
                        warship[index] = sectionHealth;
                    } else {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }
                }

            } else if ("Defend".equals(command)) {
                int startIndex = Integer.parseInt(lines.split("\\s+")[1]);
                int endIndex = Integer.parseInt(lines.split("\\s+")[2]);
                int damage = Integer.parseInt(lines.split("\\s+")[3]);

                if (IsValidIndex(pirateShip, startIndex) && IsValidIndex(pirateShip, endIndex)) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        pirateShip[i] -= damage;
                        if (pirateShip[i] <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                }

            } else if ("Repair".equals(command)) {
                int index = Integer.parseInt(lines.split("\\s+")[1]);
                int health = Integer.parseInt(lines.split("\\s+")[2]);

                if (IsValidIndex(pirateShip, index)) {
                    pirateShip[index] += health;
                    if (pirateShip[index] > maxHealth) {
                        pirateShip[index] = maxHealth;
                    }
                }

            } else if ("Status".equals(command)) {
                int count = 0;
                double repairCapacity = 0.2 * maxHealth;
                for (int i = 0; i < pirateShip.length; i++) {
                    if (pirateShip[i] < repairCapacity) {
                        count++;
                    }
                }
                System.out.printf("%d sections need repair.%n", count);
            }

            lines = scanner.nextLine();
        }

        System.out.printf("Pirate ship status: %d%n", sumOfSections(pirateShip));
        System.out.printf("Warship status: %s%n", sumOfSections(warship));

    }

    private static boolean IsValidIndex(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            return true;
        }
        return false;
    }

    private static int sumOfSections(int[] array) {
        int sum = 0;
        for (int group : array) {
            sum += group;
        }
        return sum;
    }

}
