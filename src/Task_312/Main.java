package Task_312;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num = scanner.nextInt();
        int d = b - a;
        int result = a + d * (num - 1);
        System.out.println(result);
    }
}
