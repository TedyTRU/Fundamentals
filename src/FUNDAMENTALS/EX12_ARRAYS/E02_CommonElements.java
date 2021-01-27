package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Scanner;

public class E02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (firstArray[j].equals(secondArray[i])) {
                    System.out.print(firstArray[j] + " ");
                }
            }
        }
    }
}
