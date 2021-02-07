package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(getVowelsCount(word));
    }

    private static int getVowelsCount(String word) {
        int countOfVowels = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a'
            || word.charAt(i) == 'A'
            || word.charAt(i) == 'e'
            || word.charAt(i) == 'E'
            || word.charAt(i) == 'i'
            || word.charAt(i) == 'I'
            || word.charAt(i) == 'u'
            || word.charAt(i) == 'U'
            || word.charAt(i) == 'o'
            || word.charAt(i) == 'O') {
                countOfVowels++;
            }
        }
        return countOfVowels;
    }
}
