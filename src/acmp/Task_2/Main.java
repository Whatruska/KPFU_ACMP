package acmp.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0){
            System.out.println(1);
        } else if (a > 0){
            System.out.println((1 + a) * a / 2);
        } else {
            a = -a;
            int result = (1 + a)  * a / 2;
            result = -result;
            System.out.println(result + 1);
        }
    }
}
