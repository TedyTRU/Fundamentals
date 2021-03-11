package FUNDAMENTALS.LAB27_TEXT_PROCESSING;

import java.util.Scanner;

public class L03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String line = scanner.nextLine();

        int index = line.indexOf(word);

        while (index != -1) {
            line = line.replace(word, "");
            index = line.indexOf(word);
        }
        System.out.println(line);
    }
}
