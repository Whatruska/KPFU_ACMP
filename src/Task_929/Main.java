package Task_929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long score = scanner.nextLong();
        long maxScore = score * 6;
        long minScore = score / 6;
        score %= 6;
        if (score == 1){
            minScore += 6;
        } else if (score == 2){
            minScore += 5;
        } else if (score == 3){
            minScore += 4;
        } else if (score == 4){
            minScore += 3;
        } else if (score == 5){
            minScore += 2;
        }
        System.out.println(minScore + " " + maxScore);
    }
}
