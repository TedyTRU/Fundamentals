package FUNDAMENTALS.MID_EXAM.II;

import java.util.Arrays;
import java.util.Scanner;

public class ME02_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e->Integer.parseInt(e)).toArray();
        String commandLine = scanner.nextLine();
        
        while (!commandLine.equals("end")) {
            String[] command = commandLine.split("\\s+");
            String firstCommand = command[0];
            
            if (firstCommand.equals("decrease")) {
                decreaseArray(array);

            } else {
                int firstIndex = Integer.parseInt(command[1]);
                int secondIndex = Integer.parseInt(command[2]);

                if (firstCommand.equals("swap")) {
                    swapArray(array, firstIndex, secondIndex);

                } else if (firstCommand.equals("multiply")) {
                    multiplyArray(array, firstIndex, secondIndex);
                }
            }

            commandLine = scanner.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

    }

    private static int[] decreaseArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] -= 1;
        }

        return array;
    }

    private static int[] multiplyArray(int[] array, int firstIndex, int secondIndex) {

        int multipliedNumber = array[firstIndex] * array[secondIndex];
        array[firstIndex] = multipliedNumber;

        return array;
    }

    private static int[] swapArray(int[] array, int firstIndex, int secondIndex) {

        int tempNumber = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tempNumber;

        return array;
    }
}
