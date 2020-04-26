package acmp.Task_678_WRONG;

import java.util.Scanner;

public class Main {
    static boolean isLeft = true;
    static boolean isCentral;
    static boolean isRight;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine().trim();
        for (char ch : sequence.toCharArray()){
            if (ch == 'A'){
                A();
            } else if (ch == 'B'){
                B();
            } else if (ch == 'C'){
                C();
            }
        }
        if (isLeft){
            System.out.println(1);
        } else if (isCentral){
            System.out.println(2);
        } else if (isRight){
            System.out.println(3);
        }
    }

    private static void swap(boolean bool1, boolean bool2){
        boolean tempBool = bool1;
        bool1 = bool2;
        bool2 = tempBool;
    }

    private static void A(){
        swap(isLeft, isCentral);
    }

    private static void B(){
        swap(isRight, isCentral);
    }

    private static void C(){
        swap(isLeft, isRight);
    }
}
