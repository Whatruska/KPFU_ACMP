package CodeForces.Control_1;

import java.util.Scanner;

public class Task_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string = scanner.next();
        StringBuilder builder = new StringBuilder(string);
        int index = indexOf(builder, "xxx");
        int count = 0;
        while (index != -1){
            builder.deleteCharAt(index);
            count++;
            index = indexOf(builder, "xxx");
        }
        System.out.println(count);
    }

    public static int indexOf(StringBuilder builder, String sub){
        int result = -1;
        String string = builder.toString();
        int length = string.length();
        for (int i = 0; i < length; i++){
            if (length - i < sub.length()){
                return result;
            }
            int res = sub(string, i, sub);
            if (res != -1){
                return res;
            }
        }
        return result;
    }

    private static int sub(String string, int start, String sub){
        int result = -1;
        String s = "";
        int length = sub.length();
        for (int i = start; i < start + length; i++){
            s += string.charAt(i);
        }
        if (sub.equals(s)){
            result = start;
        }
        return result;
    }
}
