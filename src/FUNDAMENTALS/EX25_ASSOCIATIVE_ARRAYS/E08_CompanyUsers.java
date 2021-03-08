package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.*;

public class E08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> companies = new TreeMap<>();

        while (!"End".equals(line)) {
            String company = line.split("->")[0];
            String ID = line.split("->")[1];

            if (!companies.containsKey(company)) {
                companies.put(company, new ArrayList<>());
            }


            line = scanner.nextLine();
        }


    }
}
