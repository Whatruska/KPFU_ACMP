package acmp.Task_542;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String resultString = new StringBuilder(Integer.toBinaryString(num)).toString();

        int twoInFactor = 1;
        int result = 0;
        for (int i = 0; i < resultString.length(); i++){
            if (resultString.charAt(i) == '1'){
                result += twoInFactor;
            }
            twoInFactor *= 2;
        }

        System.out.println(result);
    }
}
