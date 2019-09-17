package Task_131;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        int num = 0, maxAge = 0;
        for (int i = 0; i < N; i++){
            int age = scanner.nextInt();
            int sex = scanner.nextInt();
            if (age > maxAge && sex == 1){
                num = i + 1;
                maxAge = age;
            }
        }
        if (num == 0){
            System.out.println(-1);
        } else {
            System.out.println(num);
        }
    }
}
