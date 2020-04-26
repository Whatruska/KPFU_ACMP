package acmp.Task_322_PASS;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int[] fib = fib(text.length());
        String result = buildResultString(text, fib);
        System.out.println(result);
    }

    private static String buildResultString(String text, int[] fib){
        StringBuilder builder = new StringBuilder();
        for (int i : fib){
            if (i != 0) {
                builder.append(text.charAt(i - 1));
            }
        }

        if (builder.charAt(0) == builder.charAt(1)){
            builder.setCharAt(0, ' ');
        }

        return builder.toString().trim();
    }

    private static void printArr(int[] arr){
        for (int i : arr){
            if (i != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static int[] fib(int limit){
        if (limit <= 1){
            return new int[]{1};
        }
        int[] result = new int[limit + 1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i <= limit; i++){
            int c = result[i-1] + result[i - 2];
            if (c > limit){
                i = limit;
            } else {
                result[i] = c;
            }
        }
        return result;
    }
}
