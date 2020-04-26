package acmp.Task_792;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] record1 = scanner.nextLine().trim().split(" ");
        int k1 = getSumAtBase(Integer.parseInt(record1[0]), Integer.parseInt(record1[1]));

        String[] record2 = scanner.nextLine().trim().split(" ");
        int k2 = getSumAtBase(Integer.parseInt(record2[0]), Integer.parseInt(record2[1]));

        if (k1 == k2){
            System.out.println(k1);
        } else {
            System.out.println(0);
        }
    }

    private static int getSumAtBase(int num, int base){
        int sum = 0;
        while (num > 0){
            int a = num % base;
            sum += a;
            num /= base;
        }
        return sum;
    }
}
