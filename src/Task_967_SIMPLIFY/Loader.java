package Task_967_SIMPLIFY;

import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k1 = scanner.nextLong();
        long k2 = scanner.nextLong();

        ArrayList<Long> resultArray = new ArrayList<>();
        for (int i = 0; i < n; i++){
            long elem = scanner.nextLong();
            resultArray.add(b(elem,k1,k2));
        }

        resultArray.stream().sorted().forEach(x -> System.out.print(x + " "));
    }

    private static long s(long a, long k){
        long sum = 0;
        while (a > 0){
            sum += a % k;
            a /= k;
        }
        return sum;
    }

    private static long b(long elem, long k1, long k2){
        return s(elem, k1) * s(elem, k2);
    }
}
