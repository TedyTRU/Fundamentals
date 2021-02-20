package FUNDAMENTALS.MID_EXAM.III;

import java.util.Scanner;

public class ME01_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int count = 0;

        while (!"End of battle".equals(command)) {
            int distance = Integer.parseInt(command);

            if (energy < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", count, energy);
                return;
            }
            count++;
            energy -= distance;

            if (count % 3 == 0) {
                energy += count;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d", count, energy);

    }
}
