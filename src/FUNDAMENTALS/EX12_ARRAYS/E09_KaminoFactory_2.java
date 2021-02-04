package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E09_KaminoFactory_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int[] bestSample = new int[dnaLength];
        int bestSubsequence = 0;
        int bestIndex = dnaLength - 1;
        int greaterSum = 0;
        int countSample = 0;
        int bestCountSample = 0;

        while (!command.equals("Clone them!")) {
            int[] dnaSample = Arrays.stream(command.split("!+")).mapToInt(e->Integer.parseInt(e)).toArray();
            int countSequence = 0;
            int bestSequenceForSample = 0;
            int sum = 0;
            int index = 0; // int index = dnaLength - 1;

            countSample++;

            for (int i = 0; i < dnaSample.length; i++)  {
                if (dnaSample[i] == 1) {
                    countSequence++;
                    if (countSequence > bestSequenceForSample) {
                        bestSequenceForSample = countSequence;
                            index = i;
                    }

                } else {
                    countSequence = 0;
                }
                sum += dnaSample[i];
            }

            if (bestSequenceForSample > bestSubsequence) {
                bestCountSample = countSample;
                greaterSum = sum;
                bestSample = dnaSample;
                bestSubsequence = bestSequenceForSample;
                bestIndex = index;
            } else if (bestSequenceForSample == bestSubsequence) {
                if (index < bestIndex) {
                    bestCountSample = countSample;
                    greaterSum = sum;
                    bestSample = dnaSample;
                    bestSubsequence = bestSequenceForSample;
                    bestIndex = index;
                } else if (index == bestIndex) {
                    if (sum > greaterSum) {
                        bestCountSample = countSample;
                        greaterSum = sum;
                        bestSample = dnaSample;
                        bestSubsequence = bestSequenceForSample;
                        bestIndex = index;
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCountSample, greaterSum);
        for (int i : bestSample) {
            System.out.print(i + " ");
        }

    }
}

//3
//        0!0!0
//        0!0!0
//        0!0!0
//        Clone them!