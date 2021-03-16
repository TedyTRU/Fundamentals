package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import java.util.Scanner;

public class E03_ExtractFile_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] pathParts = path.split("\\\\");
        String fullFileName = pathParts[pathParts.length - 1];
        String fileName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);

    }
}
