package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES.E06_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();
        String line = scanner.nextLine();

        while (!"End".equals(line)) {
            String type = line.split("\\s+")[0];

            if (type.equals("car")) {
                type = "Car";
            } else if (type.equals("truck")) {
                type = "Truck";
            }

            String model = line.split("\\s+")[1];
            String color = line.split("\\s+")[2];
            int horsepower = Integer.parseInt(line.split("\\s+")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehicleList.add(vehicle);

            line = scanner.nextLine();
        }

        String input = scanner.nextLine();
        while (!"Close the Catalogue".equals(input)) {

            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(input)) {
                    System.out.print(vehicle.toString());
                }
            }

            input = scanner.nextLine();
        }

        double averageForCars = 0;
        double averageForTrucks = 0;
        int countCars = 0;
        int countTrucks = 0;

        for (Vehicle vehicle : vehicleList) {

            if (vehicle.getType().equals("Car")) {
                countCars++;
                averageForCars += vehicle.getHorsepower();

            } else if (vehicle.getType().equals("Truck")) {
                countTrucks++;
                averageForTrucks += vehicle.getHorsepower();
            }
        }

        if (countCars == 0) {
            averageForCars = 0;
        } else {
            averageForCars = averageForCars / countCars;
        }

        if (countTrucks == 0) {
            averageForTrucks = 0;
        } else {
            averageForTrucks = averageForTrucks / countTrucks;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageForCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageForTrucks);

    }
}
