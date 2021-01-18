package FUNDAMENTALS.EX6_BASIC;

import java.util.Scanner;

public class E04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
