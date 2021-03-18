package FUNDAMENTALS.FINAL_EXAM;

import java.util.*;

public class test {
    public static void main(String[] args) {


        String line = "Port Royal||320000||1000 ";

        //String[] lineOfCities = line.split("\\|+");
        String[] lineOfCities = line.trim().split("\\|+");


        String city = lineOfCities[0];
        int population = Integer.parseInt(lineOfCities[1]);
        int gold = Integer.parseInt(lineOfCities[2]);

        System.out.println(city);
        System.out.println(population);
        System.out.println(gold);


    }
}
