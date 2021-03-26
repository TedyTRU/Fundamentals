package FUNDAMENTALS.FINAL_EXAM;

import java.util.*;

public class test {
    public static void main(String[] args) {


//        String line = "Port Royal||320000||1000 ";
//
//        //String[] lineOfCities = line.split("\\|+");
//        String[] lineOfCities = line.trim().split("\\|+");
//
//
//        String city = lineOfCities[0];
//        int population = Integer.parseInt(lineOfCities[1]);
//        int gold = Integer.parseInt(lineOfCities[2]);
//
//        System.out.println(city);
//        System.out.println(population);
//        System.out.println(gold);
//
//
//
//        String text = "Pesho\\Gosho\\Tosho\\Sasho";
//        Arrays.stream(text.split("\\\\")).forEach(System.out::println);


        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Name", "Aman");
        stringMap.put("Address", "Kolkata");

        System.out.println("Map: " + stringMap);

        stringMap.compute("Name", (key, val) -> val.concat(" Singh"));
        stringMap.compute("Address", (key, val) -> val.concat(" West-Bengal"));

        System.out.println("New Map: " + stringMap);


        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 12);
        map.put("Key2", 15);

        System.out.println("Map: " + map);

        map.compute(null, (key, value) -> value + 3);
        System.out.println("New Map: " + map);


    }
}
