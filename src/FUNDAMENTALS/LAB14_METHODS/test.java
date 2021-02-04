package FUNDAMENTALS.LAB14_METHODS;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = readFullName(scanner);
        System.out.println(fullName);


    }

    public static String readFullName(Scanner sc) {
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        return firstName + " " + lastName;
    }
}
