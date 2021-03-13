package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import java.util.Scanner;

public class E03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        int indexOfExtension = path.indexOf(".");
        String fileExtension = path.substring(indexOfExtension + 1);

        int indexOfName = path.lastIndexOf("\\") + 1;
        String fileName = path.substring(indexOfName, indexOfExtension);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);

    }
}
