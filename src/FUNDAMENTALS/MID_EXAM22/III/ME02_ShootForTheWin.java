package FUNDAMENTALS.MID_EXAM22.III;

import java.util.Arrays;
import java.util.Scanner;

public class ME02_ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int count = 0;

        while (!"End".equals(command)) {
            int index = Integer.parseInt(command);

            if (index >= 0 && index < targets.length) {
                int value = targets[index];

                if (value != -1) {
                    targets[index] = -1;

                    for (int i = 0; i < targets.length; i++) {
                        if (targets[i] > value && targets[i] != -1) {
                            targets[i] -= value;
                        } else if (targets[i] <= value && targets[i] != -1) {
                            targets[i] += value;
                        }
                    }
                }
                count++;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", count);
        for (int target : targets) {
            System.out.print(target + " ");
        }

    }
}
