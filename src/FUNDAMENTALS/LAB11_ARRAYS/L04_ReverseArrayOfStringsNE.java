package FUNDAMENTALS.LAB11_ARRAYS;

import java.util.Scanner;

public class L04_ReverseArrayOfStringsNE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
