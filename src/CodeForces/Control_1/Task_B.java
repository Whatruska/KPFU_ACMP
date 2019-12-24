package CodeForces.Control_1;

import java.util.Scanner;

public class Task_B {
    public static int delta = 'a' - 'A';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lower = 0;
        int upper = 0;
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (isLower(ch)){
                lower++;
            } else {
                upper++;
            }
        }
        if (lower >= upper){
            input = toLowerCase(input);
        } else {
            input = toUpperCase(input);
        }
        System.out.println(input);
    }

    public static String toUpperCase(String string){
        String result = "";
        for (int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (isLower(ch)){
                ch = toUpper(ch);
            }
            result += ch;
        }
        return result;
    }

    public static String toLowerCase(String string){
        String result = "";
        for (int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (isUpper(ch)){
                ch = toLower(ch);
            }
            result += ch;
        }
        return result;
    }

    public static char toLower(char ch){
        return  (char) (ch + delta);
    }

    public static char toUpper(char ch){
        return  (char) (ch - delta);
    }

    public static boolean isLower(char ch){
        return ch >= 'a' && ch <= 'z';
    }

    public static boolean isUpper(char ch){
        return ch >= 'A' && ch <= 'Z';
    }
}
