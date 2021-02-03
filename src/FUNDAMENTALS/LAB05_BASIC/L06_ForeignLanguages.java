package FUNDAMENTALS.LAB05_BASIC;

import java.util.Scanner;

public class L06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country) {
            case "England":
            case "USA":
                System.out.println("English"); break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish"); break;
            default:
                System.out.println("unknown");
        }
    }
}
