package Task_675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = Integer.parseInt(scanner.nextLine().trim());
        int minCount = M + 1;
        for (int i = 0; i < N; i++){
            char[] input = scanner.nextLine().trim().toCharArray();
            int count = 0;
            for (char ch : input){
                if (ch == '.'){
                    count++;
                }
            }
            if (count < minCount){
                minCount = count;
            }
        }
        System.out.println(minCount);
    }
}
