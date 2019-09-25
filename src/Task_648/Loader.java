package Task_648;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < N; i++){
            cards.add(scanner.nextInt());
        }

        Collections.sort(cards);

        int playerSum = 0;

        for (int i = 0; i < N/2; i++){
            Integer max = Collections.max(cards);
            playerSum += max;
            cards.remove(max);
        }

        int casinoSum = cards.stream().mapToInt((x) -> x).sum();

        System.out.println(playerSum - casinoSum);
    }
}
