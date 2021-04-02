package FUNDAMENTALS.FINAL_EXAM.IV;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02_FancyBarcodes_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String productRegex = "@#+(?<product>[A-Z][a-zA-Z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(productRegex);

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                //валиден
                String product = matcher.group("product");
                String productGroup = "";
                //"FreshFisH" -> ""
                //"Brea0D" -> "0"
                //"Che4s6E" -> "46"
                for (int index = 0; index <= product.length() - 1; index++) {
                    char currentSymbol = product.charAt(index);
                    if (Character.isDigit(currentSymbol)) {
                        productGroup += currentSymbol;
                    }

                }
                //ако нямаме цифри
                if (productGroup.equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + productGroup);
                }

            } else {
                //невалиден
                System.out.println("Invalid barcode");
            }

        }

    }
}

