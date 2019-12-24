package CodeForces.Control_2;

import java.util.Scanner;

public class Task_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] dvugrams = new String[n-1];
        String input = scanner.next();
        for (int i = 0; i < input.length() - 1; i++){
            char ch1 = input.charAt(i);
            char ch2 = input.charAt(i + 1);
            if (isLetter(ch1) && isLetter(ch2)){
                String dvugram = "" + ch1 + ch2;
                dvugrams[i] = dvugram;
            }
        }

        int max = Integer.MIN_VALUE;
        String dvu = dvugrams[0];
        for (int i = 0; i < dvugrams.length; i++){
            int count = 1;
            String dvugram = dvugrams[i];
            if (dvugram != null){
                for (int j = i + 1; j < dvugrams.length; j++){
                    if (dvugram.equals(dvugrams[j])){
                        count++;
                    }
                }
                if (count > max){
                    dvu = dvugrams[i];
                    max = count;
                }
            }
        }
        System.out.println(dvu);
    }

    public static boolean isLetter(char ch){
        return ch >= 'A' && ch <= 'Z';
    }
}
