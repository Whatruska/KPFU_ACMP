package acmp.Task_929_ARRRRISHA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long score = scanner.nextLong();
        //Предпологаем что макс счет = кол-во кубиков * 6, тип все кубики выпали единицей вверх
        long maxScore = score * 6;
        //Аналогичная штука, но выпали шестеркой вверх
        long minScore = score / 6;
        //Считаем что есть несколько кубиков, выпавших 6-кой вверх и один выпавший не 6-кой, находим сколько выпало на этом кубике
        score %= 6;
        //Добавляем очков игроку в зависимости от того сколько выпало на верхней грани
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
