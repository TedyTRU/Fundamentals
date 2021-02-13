package FUNDAMENTALS.EX15_METHODS;

import java.util.Arrays;
import java.util.Scanner;

public class E11_ArrayManipulator {
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

                if (maxCommand.equals("even")) {
                    printMaxEven(array);
                } else if (maxCommand.equals("odd")) {
                    printMaxOdd(array);
                }

            } else if (command.equals("min")) {
                String minCommand = commandArr[1];

                if (minCommand.equals("even")) {
                    printMinEven(array);
                } else if (minCommand.equals("odd")) {
                    printMinOdd(array);
                }

            } else if (commandArr.length == 3) {
                int count = Integer.parseInt(commandArr[1]);
                String firstCommand = commandArr[2];

                if (count > array.length) {
                    System.out.println("Invalid count");

                } else if (command.equals("first")) {
                    if (firstCommand.equals("even")) {
                        getFirstEvenElements(array, count);
                    } else if (firstCommand.equals("odd")) {
                        getFirstOddElements(array, count);
                    }

                } else if (command.equals("last")) {
                    if (firstCommand.equals("even")) {
                        getLastEvenElements(array, count);
                    } else if (firstCommand.equals("odd")) {
                        getLastOddElements(array, count);
                    }
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

    private static void getLastOddElements(int[] array, int count) {
        int[] lastOddElements = new int[count];
        int countOdds = 0;
        int index = count - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (index == -1) {
                break;
            }
            if (array[i] % 2 != 0) {
                lastOddElements[index] = array[i];
                countOdds++;
                index--;
            }
        }
        if (countOdds == 0) {
            System.out.println("[]");
        } else if (countOdds == count) {
            printArray(lastOddElements);
        } else if (countOdds < count) {
            int[] lastOdd = new int[countOdds];
            int lastIndex = lastOddElements.length - 1;
            for (int i = 0; i < countOdds; i++) {
                lastOdd[i] = lastOddElements[lastIndex];
                lastIndex--;
            }
            printArray(lastOdd);
        }
    }

    private static void getLastEvenElements(int[] array, int count) {
        int[] lastEvenElements = new int[count];
        int countEvens = 0;
        int index = count - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (index == -1) {
                break;
            }
            if (array[i] % 2 == 0) {
                lastEvenElements[index] = array[i];
                countEvens++;
                index--;
            }
        }
        if (countEvens == 0) {
            System.out.println("[]");
        } else if (countEvens == count) {
            printArray(lastEvenElements);
        } else if (countEvens < count) {
            int[] lastEven = new int[countEvens];
            int lastIndex = lastEvenElements.length - 1;
            for (int i = 0; i < countEvens; i++) {
                lastEven[i] = lastEvenElements[lastIndex];
                lastIndex--;
            }
            printArray(lastEven);
        }
    }

    private static void getFirstOddElements(int[] array, int count) {
        int[] firstOddElements = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (index == count) {
                break;
            }
            if (array[i] % 2 != 0) {
                firstOddElements[index] = array[i];
                index++;
            }
        }
        if (index == 0) {
            System.out.println("[]");
        } else if (index == count) {
            printArray(firstOddElements);
        } else if (index < count) {
            int[] firstOdd = new int[index];
            for (int i = 0; i < index; i++) {
                firstOdd[i] = firstOddElements[i];
            }
            printArray(firstOdd);
        }
    }

    private static void getFirstEvenElements(int[] array, int count) {
        int[] firstEvenElements = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (index == count) {
                break;
            }
            if (array[i] % 2 == 0) {
                firstEvenElements[index] = array[i];
                index++;
            }
        }
        if (index == 0) {
            System.out.println("[]");
        } else if (index == count) {
            printArray(firstEvenElements);
        } else if (index < count) {
            int[] firstEven = new int[index];
            for (int i = 0; i < index; i++) {
                firstEven[i] = firstEvenElements[i];
            }
            printArray(firstEven);
        }
    }

    private static void printMinOdd(int[] array) {
        int index = -1;
        int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] <= minOdd) {
                minOdd = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printMinEven(int[] array) {
        int index = -1;
        int minEven = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] <= minEven) {
                minEven = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printMaxOdd(int[] array) {
        int index = -1;
        int maxOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] >= maxOdd) {
                maxOdd = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printMaxEven(int[] array) {
        int index = -1;
        int maxEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= maxEven) {
                maxEven = array[i];
                index = i;
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
