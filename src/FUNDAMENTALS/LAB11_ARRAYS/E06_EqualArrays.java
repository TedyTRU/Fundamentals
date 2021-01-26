package FUNDAMENTALS.LAB11_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        boolean areIdentical = true;
        int sum = 0;
        for (int i = 0; i < firstArr.length; i++) {
             if (firstArr[i] != secondArr[i]) {
                 System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                 areIdentical = false;
                 break;
             } else {
                 sum += firstArr[i];
             }
        }
        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
