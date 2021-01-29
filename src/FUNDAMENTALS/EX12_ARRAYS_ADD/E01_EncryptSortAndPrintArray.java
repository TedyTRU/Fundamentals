package FUNDAMENTALS.EX12_ARRAYS_ADD;

import java.util.Arrays;
import java.util.Scanner;

public class E01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] encryptedArr = new int[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int sum = 0;

            for (int j = 0; j < name.length(); j++) {

                if (name.charAt(j) == 65 ||
                name.charAt(j) == 69 ||
                name.charAt(j) == 73 ||
                name.charAt(j) == 79 ||
                name.charAt(j) == 85 ||
                //name.charAt(j) == 89 ||
                //name.charAt(j) == 121 ||
                name.charAt(j) == 97 ||
                name.charAt(j) == 101 ||
                name.charAt(j) == 105 ||
                name.charAt(j) == 111 ||
                name.charAt(j) == 117) {
                    sum += (name.charAt(j) * name.length());

                } else {
                    sum += (name.charAt(j) / name.length());
                }
            }
            encryptedArr[i] = sum;
        }
        Arrays.sort(encryptedArr);
        for (int i : encryptedArr) {
            System.out.println(i);
        }

    }
}
