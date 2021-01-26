package FUNDAMENTALS.LAB11_ARRAYS;

import java.util.Scanner;

public class L04_ReverseArrayOfStrings_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length / 2; i++) {
            String oldElement = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", arr));
    }
}
