package acmp.Task_323_PASS;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num / 2; i++){
            if (isPrime(i)){
                int secondNum = num - i;
                if (isPrime(secondNum)){
                    System.out.println(i + " " + secondNum);
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        if (num < 4){
            return true;
        }
        for (int i = 2; i <= num / 2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
