package Task_643;

import java.util.Scanner;

public class Main {
    private static long count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        convertToBit(a);
        System.out.println(a + count);
    }

    private static void convertToBit(long num){
        while (num > 0){
            long a = num % 2;
            if (a == 1){
                count++;
            }
            num /= 2;
        }
    }
}
