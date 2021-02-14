package FUNDAMENTALS.EX18_LISTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrays = scanner.nextLine().split("\\|");
        List<String> appendArrays = new ArrayList<>();
        //List<Integer> values = new ArrayList<>();

        for (int i = arrays.length - 1; i >= 0; i--) {
            String[] array = arrays[i].split("\\s+");

            for (int j = 0; j < array.length; j++) {
                if (!array[j].equals("")) {
                    appendArrays.add(array[j]);
                }
                //int number = Integer.parseInt(array[j]);
                //values.add(number);
            }
        }
        for (String appendArray : appendArrays) {
            System.out.print(appendArray + " ");
        }

//        for (Integer value : values) {
//            System.out.print(value + " ");
//        }
    }
}
