package FUNDAMENTALS.EX6_BASIC;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int stNum = num;
        int sum = 0;
        while (num != 0) {
            int a = num % 10;
            int factoriel = 1;
            for (int i = 1; i <= a; i++) {
                factoriel = factoriel * 1;
            }
            sum += factoriel;
            num /= 10;
        }
        if (sum != stNum) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
