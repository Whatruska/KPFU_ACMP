package acmp.Task_514;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        S *= 2;
        int result;
        for (int i = 0; ; i++){
            if (i * i + i > S){
                result = i - 1;
                break;
            }
        }
        System.out.println(result);
    }
}
