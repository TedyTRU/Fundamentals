package FUNDAMENTALS.FINAL_EXAM.IV;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBarcodes = Integer.parseInt(scanner.nextLine());
        String regexForBarcode = "@#+[A-Z][a-zA-Z0-9]{4,}[A-Z]@#+";
        Pattern patternForBarcode = Pattern.compile(regexForBarcode);
        String regexForProductGroup = "\\d";
        Pattern patternForProductGroup = Pattern.compile(regexForProductGroup);


        for (int i = 0; i < numberOfBarcodes; i++) {
            String barcode = scanner.nextLine();
            Matcher matcherForBarcode = patternForBarcode.matcher(barcode);

            if (matcherForBarcode.find()) {
                Matcher matcherForProductGroup = patternForProductGroup.matcher(matcherForBarcode.group());
                StringBuilder productGroup = new StringBuilder();

                if (!matcherForProductGroup.find()) {
                    productGroup.append("00");

                } else {
                    productGroup.append(matcherForProductGroup.group());
                    while (matcherForProductGroup.find()) {
                        productGroup.append(matcherForProductGroup.group());
                    }
                }
                System.out.printf("Product group: %s%n", productGroup);

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
