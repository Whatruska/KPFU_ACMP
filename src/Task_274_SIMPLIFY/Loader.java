package Task_274_SIMPLIFY;

import java.util.*;
import java.util.stream.Collectors;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            ArrayList<Character> firstList = new ArrayList<>();
            for (char ch: Integer.toString(a).toCharArray()){
                firstList.add(ch);
            }
            Set<Character> firstSet = firstList.stream().collect(Collectors.toSet());

            ArrayList<Character> secondList = new ArrayList<>();
            for (char ch: Integer.toString(b).toCharArray()){
                secondList.add(ch);
            }
            Set<Character> secondSet = secondList.stream().collect(Collectors.toSet());

            if (firstSet.equals(secondSet)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
