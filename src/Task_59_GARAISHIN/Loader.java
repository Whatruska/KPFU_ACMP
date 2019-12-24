package Task_59_GARAISHIN;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        long sum = 0;
        long multiply = 1;
        while (n > 0){
            long k_dit = n % k;
            sum += k_dit;
            multiply *= k_dit;
            n /= k;
        }

        System.out.println(multiply - sum);
    }
}
