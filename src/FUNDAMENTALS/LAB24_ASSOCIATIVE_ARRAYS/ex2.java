package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> infectedByCity = new HashMap<>();

        String command = scanner.next();
        while (!"end".equals(command)) {
            if ("report".equals(command)) {
                String cityName = scanner.next();

                System.out.println(infectedByCity.get(cityName));
            } else {
                int newlyInfected = scanner.nextInt();

                Integer currentInfected = infectedByCity.get(command);
                if (currentInfected == null) {
                    currentInfected = 0;
                }
                infectedByCity.put(command, currentInfected + newlyInfected);
            }
            command = scanner.next();
        }

        for (Map.Entry<String, Integer> entry : infectedByCity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println(infectedByCity.size());
    }
}
