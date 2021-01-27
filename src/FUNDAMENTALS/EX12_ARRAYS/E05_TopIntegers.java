package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        for (int i = 0; i < arr.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
