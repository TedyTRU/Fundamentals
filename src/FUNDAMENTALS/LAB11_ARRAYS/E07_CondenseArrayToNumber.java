package FUNDAMENTALS.LAB11_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

            int[] condensed = new int[arr.length - 1];

            while (condensed.length > 1) {
                condensed = new int[arr.length - 1];
                for (int i = 0; i < arr.length - 1; i++) {

                    condensed[i] = arr[i] + arr[i + 1];
                }
                arr = condensed;

            }

            System.out.println(arr[0]);

    }
}
