package Task_675_ARRRRISHA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Считываем размерность
        int N = scanner.nextInt();
        int M = Integer.parseInt(scanner.nextLine().trim());
        //Инициализируем минимум
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++){
            //Считываем очередную строчку и превращаем ее в массив char`ов
            char[] input = scanner.nextLine().trim().toCharArray();
            int count = 0;
            //Считаем кол-во точек в строке
            for (char ch : input){
                if (ch == '.'){
                    count++;
                }
            }
            //Ес кол-во точек в строке < общий минимум
            if (count < minCount){
                minCount = count;
            }
        }
        System.out.println(minCount);
    }
}
