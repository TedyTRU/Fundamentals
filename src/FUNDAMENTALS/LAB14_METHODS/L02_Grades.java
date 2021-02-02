package FUNDAMENTALS.LAB14_METHODS;

import java.util.Scanner;

public class L02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGradeInWords(grade);

    }
    private static void printGradeInWords (double grade) {
        if (grade < 3) {
            System.out.println("Fail");
        } else if (grade < 3.50) {
            System.out.println("Poor");
        } else if (grade < 4.50) {
            System.out.println("Good");
        } else if (grade < 5.50) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
