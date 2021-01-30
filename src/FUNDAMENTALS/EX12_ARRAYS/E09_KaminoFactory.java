package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E09_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthDNA = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int[] bestSampleArr = new int[lengthDNA];
        int bestSequence = 1;
        int bestIndex = lengthDNA;
        int bestSum = 0;
        int countSample = 0;
        int bestSample = 0;

        while (!"Clone them!".equals(command)) {
            int[] DNA = Arrays.stream(command.split("!+"))
                    .mapToInt(e->Integer.parseInt(e)).toArray();
            countSample++;
            int countSequence = 1;
            int maxSequence = 1;
            int index = 0;
            int sum = 0;

            for (int i = 0; i < lengthDNA - 1; i++) {
                if ( DNA[i] == DNA[i + 1] && DNA[i] == 1) {
                    countSequence++;
                    if (countSequence > maxSequence) {
                        maxSequence = countSequence;
                        index = i;
                    }
                }
                sum += DNA[i];
            }
            sum += DNA[DNA.length - 1];
            if (maxSequence > bestSequence) {
                bestSampleArr = DNA;
                bestIndex = index;
                bestSequence = maxSequence;
                bestSum = sum;
                bestSample = countSample;
            } else if (maxSequence == bestSequence) {
                if(index < bestIndex) {
                    bestSampleArr = DNA;
                    bestIndex = index;
                    bestSequence = maxSequence;
                    bestSum = sum;
                    bestSample = countSample;
                } else if (index == bestIndex) {
                    if (sum > bestSum) {
                        bestSampleArr = DNA;
                        bestIndex = index;
                        bestSequence = maxSequence;
                        bestSum = sum;
                        bestSample = countSample;
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, bestSum);
        for ( int output: bestSampleArr) {
            System.out.print(output + " ");
        }
    }
}

//5
//        0!0!0!!!!!0!1
//        1!0!1!1!0
//        0!1!1!0!0
//        0!0!0!!!!!0!1
//        Clone them!