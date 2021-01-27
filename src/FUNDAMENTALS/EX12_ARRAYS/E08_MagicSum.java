package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == magicNum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }

//            if ((arr[i] + arr[i + 1]) == magicNum) {
//                System.out.println(arr[i] + " " + arr[i + 1]);
//            }
        }
    }
}
