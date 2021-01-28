package FUNDAMENTALS.LAB11_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class L03_SumEvenNumbers_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(num -> Integer.parseInt(num))
                .filter(num -> num % 2 == 0).toArray();

        int sum = 0;
        for (int num : number) {
            sum += num;
        }
        System.out.println(sum);
    }
}
