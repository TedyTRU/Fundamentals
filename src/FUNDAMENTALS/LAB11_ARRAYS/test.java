package FUNDAMENTALS.LAB11_ARRAYS;

import java.math.BigDecimal;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        b = b - a;
        a = b + a;
        b = a - b;

        a = a + b; // 25
        b = a - b; // 10
        a = a - b; // 15

        System.out.println(a);
        System.out.println(b);






        BigDecimal[] array = new BigDecimal[10];
        Scanner[] arr = new Scanner[10];

    }
}
