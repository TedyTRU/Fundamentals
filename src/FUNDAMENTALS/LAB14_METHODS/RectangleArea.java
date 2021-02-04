package FUNDAMENTALS.LAB14_METHODS;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = getRectangleArea(width, height);
        System.out.printf("%.0f", area);

    }

    private static double getRectangleArea(double width, double height) {
        double rectangleArea = width * height;
        return rectangleArea;
    }
}
