package FUNDAMENTALS.LAB8_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        int year = new Scanner(System.in).nextInt();
        final int unixEpochTimeStartYear = 1970;

        int yearsPassed = year - unixEpochTimeStartYear;

        System.out.println(yearsPassed);

        final long secondsInYear = 365 * 24 * 60 * 60;

        long epochTime = yearsPassed * secondsInYear;
        System.out.println(epochTime);

    }
}
