package FUNDAMENTALS.EX6_BASIC;

import java.util.Scanner;

public class E09_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabrePrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double freeBelt = Math.floor(students / 6);

        double equipmentPrice = (Math.ceil(1.1 * students) * sabrePrice) + (students * robePrice) + ((students - freeBelt) * beltPrice);

        if (money >= equipmentPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", equipmentPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", (equipmentPrice - money));
        }
    }
}
