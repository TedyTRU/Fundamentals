package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {
        Map<String, Integer> infectedByCity = new HashMap<>();

        int firstDay = 15;
        int secondDay = 30;

        //infectedByCity.putIfAbsent("Gabrovo", 0); -> по-бързо като писане на код, но по-бавно като изпълнение
        //int current = infectedByCity.get("Gabrovo");

        Integer current = infectedByCity.get("Gabrovo");
        if (current == null) {
            current = 0;
        }

        infectedByCity.put("Gabrovo", current + firstDay);

        current = infectedByCity.get("Gabrovo");
        if (current == null) {
            current = 0;
        }

        infectedByCity.put("Gabrovo", current + secondDay);

        System.out.println(infectedByCity.get("Gabrovo"));

    }
}
