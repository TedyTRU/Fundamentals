package FUNDAMENTALS.LAB20_OBJECTS_AND_CLASSES;

import java.util.Random;
import java.util.Scanner;

public class L01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listOfWords = scanner.nextLine().split(" ");

        Random random = new Random();
        for (int i = 0; i < listOfWords.length; i++) {
            int randomIndex = random.nextInt(listOfWords.length);
            String temp = listOfWords[i];

            listOfWords[i] = listOfWords[randomIndex];
            listOfWords[randomIndex] = temp;
        }

        for (String word : listOfWords) {
            System.out.println(word);
        }

    }
}
