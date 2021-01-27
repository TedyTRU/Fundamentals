package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        boolean areEqual = false;

        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                areEqual = true;
                System.out.println(i);
            }
        }
        if (!areEqual) {
            System.out.println("no");
        }
    }
}
