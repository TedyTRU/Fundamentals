package FUNDAMENTALS.LAB20_OBJECTS_AND_CLASSES;

public class MainDice {
    public static void main(String[] args) {
        Dice myDice = new Dice(10, "red");
        //myDice.sides = 10;
        //int sides = myDice.getSides();
        myDice.setSides(-10);
        //myDice.color = "blue";
        myDice.setColor("blue");

        Dice mySecondDice = new Dice();
        mySecondDice.setSides(6);
        mySecondDice.roll();

        System.out.println(myDice.getSides());
        System.out.println(myDice.roll());

    }
}
