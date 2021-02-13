package FUNDAMENTALS.EX15_METHODS;

import java.util.Arrays;
import java.util.Scanner;

public class E11_ArrayManipulator_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String commandLine = scanner.nextLine();

        while (!"end".equals(commandLine)) {
            String[] commandArr = commandLine.split(" ");
            String command = commandArr[0];

            if (command.equals("exchange")) {
                int index = Integer.parseInt(commandArr[1]);

                if (index >= array.length || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    array = exchangeArray(array, index);
                }

            } else if (command.equals("max")) {
                String maxCommand = commandArr[1];

                printMaxEvenOdd(array, maxCommand);

            } else if (command.equals("min")) {
                String minCommand = commandArr[1];

                printMinEvenOdd(array, minCommand);

            } else if (commandArr.length == 3) {
                int count = Integer.parseInt(commandArr[1]);
                String firstLastCommand = commandArr[2];

                if (count > array.length) {
                    System.out.println("Invalid count");

                } else if (command.equals("first")) {

                    getFirstEvenOddElements(array, count, firstLastCommand);

                } else if (command.equals("last")) {

                    getLastEvenOddElements(array, count, firstLastCommand);
                }
            }

            commandLine = scanner.nextLine();
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (i == array.length - 1) {
                System.out.println(element + "]");
                break;
            }
            System.out.print(element + ", ");
        }
    }

    private static void getLastEvenOddElements(int[] array, int count, String command) {
        int[] lastEvenOddElements = new int[count];
        int countEvensOdds = 0;
        int index = count - 1;

        if (command.equals("even")) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (index == -1) {
                    break;
                }
                if (array[i] % 2 == 0) {
                    lastEvenOddElements[index] = array[i];
                    countEvensOdds++;
                    index--;
                }
            }

        } else if (command.equals("odd")) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (index == -1) {
                    break;
                }
                if (array[i] % 2 != 0) {
                    lastEvenOddElements[index] = array[i];
                    countEvensOdds++;
                    index--;
                }
            }
        }

        if (countEvensOdds == 0) {
            System.out.println("[]");

        } else if (countEvensOdds == count) {
            printArray(lastEvenOddElements);

        } else if (countEvensOdds < count) {
            int[] lastEvenOdd = new int[countEvensOdds];
            int lastIndex = lastEvenOddElements.length - 1;
            for (int i = 0; i < countEvensOdds; i++) {
                lastEvenOdd[i] = lastEvenOddElements[lastIndex];
                lastIndex--;
            }
            printArray(lastEvenOdd);
        }
    }

    private static void getFirstEvenOddElements(int[] array, int count, String command) {
        int[] firstEvenOddElements = new int[count];
        int index = 0;

        if (command.equals("even")) {
            for (int i = 0; i < array.length; i++) {
                if (index == count) {
                    break;
                }
                if (array[i] % 2 == 0) {
                    firstEvenOddElements[index] = array[i];
                    index++;
                }
            }

        } else if (command.equals("odd")) {

            for (int i = 0; i < array.length; i++) {
                if (index == count) {
                    break;
                }
                if (array[i] % 2 != 0) {
                    firstEvenOddElements[index] = array[i];
                    index++;
                }
            }
        }

        if (index == 0) {
            System.out.println("[]");

        } else if (index == count) {
            printArray(firstEvenOddElements);

        } else if (index < count) {
            int[] firstEvenOdd = new int[index];
            for (int i = 0; i < index; i++) {
                firstEvenOdd[i] = firstEvenOddElements[i];
            }
            printArray(firstEvenOdd);
        }
    }

    private static void printMinEvenOdd(int[] array, String command) {
        int index = -1;
        int min = Integer.MAX_VALUE;

        if (command.equals("odd")) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0 && array[i] <= min) {
                    min = array[i];
                    index = i;
                }
            }
        } else if (command.equals("even")) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && array[i] <= min) {
                    min = array[i];
                    index = i;
                }
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printMaxEvenOdd(int[] array, String command) {
        int index = -1;
        int max = 0;

        if (command.equals("odd")) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0 && array[i] >= max) {
                    max = array[i];
                    index = i;
                }
            }
        } else if (command.equals("even")) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && array[i] >= max) {
                    max = array[i];
                    index = i;
                }
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static int[] exchangeArray(int[] array, int index) {
        int[] manipulatedArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            index++;
            if (index == array.length) {
                index = 0;
            }
            manipulatedArr[i] = array[index];
        }
        return manipulatedArr;
    }
}
