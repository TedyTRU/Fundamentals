package FUNDAMENTALS.FINAL_EXAM.III;

import java.util.*;

public class FE03_NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> cars = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] lines = scanner.nextLine().split("\\|");
            String car = lines[0];
            int mileage = Integer.parseInt(lines[1]);
            int fuel = Integer.parseInt(lines[2]);

            cars.put(car, Arrays.asList(mileage, fuel));

        }

        String lines = scanner.nextLine();

        while (!"Stop".equals(lines)) {
            String command = lines.split(" : ")[0];
            String car = lines.split(" : ")[1];

            if ("Drive".equals(command)) {
                int distance = Integer.parseInt(lines.split(" : ")[2]);
                int fuel = Integer.parseInt(lines.split(" : ")[3]);

                if (fuel > cars.get(car).get(1)) {
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    int mileage = cars.get(car).get(0) + distance;
                    int currentFuel = cars.get(car).get(1) - fuel;

                    cars.put(car, Arrays.asList(mileage, currentFuel));
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);

                    if (mileage >= 100000) {
                        cars.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                }

            } else if ("Refuel".equals(command)) {
                int fuel = Integer.parseInt(lines.split(" : ")[2]);
                int currentFuel = cars.get(car).get(1);

                if ((fuel + currentFuel) > 75) {
                    fuel = 75 - currentFuel;
                }
                cars.get(car).set(1, fuel + currentFuel);
                System.out.printf("%s refueled with %d liters%n", car, fuel);

            } else if ("Revert".equals(command)) {
                int kilometers = Integer.parseInt(lines.split(" : ")[2]);
                int mileage = cars.get(car).get(0);
                mileage -= kilometers;

                if (mileage >= 10000) {
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                } else {
                    mileage = 10000;
                }

                cars.get(car).set(0, mileage);
            }

            lines = scanner.nextLine();
        }
        cars.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().get(0).compareTo(e1.getValue().get(0)))
                //.sorted((n1, n2) -> n2.getKey().compareTo(n1.getKey()))
                .forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
