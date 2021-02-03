package FUNDAMENTALS.LAB05_BASIC;

import java.util.Scanner;

public class L04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int minutes = hours * 60 + min + 30;

        int hh = minutes / 60;
        int mm = minutes % 60;

        if (hh == 24) {
            hh = 0;
        }
        if (mm < 10) {
            System.out.printf("%d:0%d", hh, mm);
        } else {
            System.out.printf("%d:%d", hh, mm);
        }
    }
}
