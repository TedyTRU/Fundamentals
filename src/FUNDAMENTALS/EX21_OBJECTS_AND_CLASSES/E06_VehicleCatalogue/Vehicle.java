package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES.E06_VehicleCatalogue;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private double horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f%n", type, model, color, horsepower);
    }
}
