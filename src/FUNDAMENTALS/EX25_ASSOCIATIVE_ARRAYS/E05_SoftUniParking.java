package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E05_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingValidation = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String command = line[0];
            String username = line[1];

            if (command.equals("register")) {
                String license = line[2];
                if (parkingValidation.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", license);
                } else {
                    parkingValidation.put(username, license);
                    System.out.printf("%s registered %s successfully%n", username, license);
                }

            } else if (command.equals("unregister")) {
                if (!parkingValidation.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    parkingValidation.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }

        for (Map.Entry<String, String> entry : parkingValidation.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
