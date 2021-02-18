package FUNDAMENTALS.LAB20_OBJECTS_AND_CLASSES;

import java.util.Random;

public class Dice {
    private int sides;
    private String color;
    int size;

    public Dice() {

    }

    public Dice(int sides, String color) {
        this.sides = sides;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getSides() {
        return sides;
    }

    public void setSides(int number) {
        if (number < 0) {
            number = 1;
        }
        sides = number;
    }

    int roll() {
        Random random = new Random();
        int number = random.nextInt(sides + 1);
        return number;
    }

}
