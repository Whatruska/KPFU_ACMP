package Task_633;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine().trim();
        String[] participants = new String[3];
        for (int i = 0; i < participants.length; i++){
            participants[i] = scanner.nextLine().trim();
        }
        Arrays.sort(participants);
        System.out.println(team + ": " + participants[0] + ", " + participants[1] + ", " + participants[2]);
    }
}
