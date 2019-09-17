package Task_534;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] btns = new int[N];
        for (int i = 0; i < btns.length; i++){
            btns[i] = scanner.nextInt();
        }
        int K = scanner.nextInt();
        for (int i = 0; i < K; i++){
            int btnNum = scanner.nextInt() - 1;
            btns[btnNum]--;
        }
        for (int btn : btns){
            if (btn > 0){
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}
