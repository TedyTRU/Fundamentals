package FUNDAMENTALS.MID_EXAM22.VI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ME02_SoftUniKaraoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> songs = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        List<String> awards = new ArrayList<>();

        while (!"dawn".equals(command)) {
            String[] performance = command.split(", ");
            String participant = performance[0];
            String song = performance[1];
            String award = performance[2];

            if (participants.contains(participant) && songs.contains(song)) {


            }


            command = scanner.nextLine();
        }


    }
}
