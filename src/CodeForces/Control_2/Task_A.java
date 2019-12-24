package CodeForces.Control_2;

import java.util.Scanner;

public class Task_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        StringBuilder builder = new StringBuilder(input);
        String result = "";
        int count = 0;
        while (builder.length() > 0){
            if (count % 2 == 0){
                result = builder.charAt(0) + result;
            } else {
                result = result + builder.charAt(0);
            }
            builder.deleteCharAt(0);
            count++;
        }
        if (count % 2 != 0) {
            for (int i = 0; i < result.length(); i++) {
                System.out.print(result.charAt(result.length() - i - 1));
            }
        } else {
            System.out.println(result);
        }
    }
}
