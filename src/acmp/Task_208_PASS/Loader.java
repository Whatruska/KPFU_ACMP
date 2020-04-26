package acmp.Task_208_PASS;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        String bitString = convertToBitString(num);
        for (int i = 0; i < bitString.length(); i++){
            bitString = shift(bitString);
            int value = convertFromBitString(bitString);
            if (value > max){
                max = value;
            }
        }
        if (num == 0){
            System.out.println(0);
        } else if (num == 1){
            System.out.println(1);
        } else {
            System.out.println(max);
        }
    }

    private static String convertToBitString(int num){
        StringBuilder builder = new StringBuilder();
        while (num > 0){
            builder.append(num % 2);
            num /= 2;
        }
        return builder.reverse().toString();
    }

    private static int convertFromBitString(String bitString){
        int result = 0;
        StringBuilder builder = new StringBuilder(bitString);
        builder.reverse();
        for (int i = 0; i < builder.length(); i++){
            char ch = builder.charAt(i);
            if (ch == '1'){
                result += Math.pow(2, i);
            }
        }
        return result;
    }

    private static String shift(String bitString){
        char buff = bitString.charAt(0);
        StringBuilder builder = new StringBuilder(bitString);
        for (int i = 1; i < bitString.length(); i++){
            builder.setCharAt(i - 1, bitString.charAt(i));
        }
        builder.setCharAt(bitString.length() - 1, buff);
        return builder.toString();
    }
}
