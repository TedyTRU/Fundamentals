package FUNDAMENTALS.FINAL_EXAM.V;

import java.util.Scanner;

public class FE01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String commands = scanner.nextLine();

        while (!"Generate".equals(commands)) {
            String command = commands.split(">>>")[0];

            if (command.equals("Contains")) {
                String substring = commands.split(">>>")[1];

                if (activationKey.contains(substring)) {
                    System.out.printf("%s contains %s%n", activationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (command.equals("Flip")) {
                String token = commands.split(">>>")[1];
                int startIndex = Integer.parseInt(commands.split(">>>")[2]);
                int endIndex = Integer.parseInt(commands.split(">>>")[3]);
                String replace = activationKey.substring(startIndex, endIndex);

                if (token.equals("Upper")) {
                    activationKey = activationKey.replace(replace, replace.toUpperCase());

                } else if (token.equals("Lower")) {
                    activationKey = activationKey.replace(replace, replace.toLowerCase());

                }
                System.out.println(activationKey);

            } else if (command.equals("Slice")) {
                int startIndex = Integer.parseInt(commands.split(">>>")[1]);
                int endIndex = Integer.parseInt(commands.split(">>>")[2]);
                String replace = activationKey.substring(startIndex, endIndex);

                activationKey = activationKey.replace(replace, "");

                System.out.println(activationKey);
            }

            commands = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
