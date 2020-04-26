package CodeForces.Homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*

6 2
B 10 3
S 50 2
S 40 1
S 50 6
B 20 4
B 25 10

 */

public class Task_A {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, Integer> buyMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        TreeMap<Integer, Integer> sellMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer - t1;
            }
        });

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());
        int p = Integer.parseInt(tokenizer.nextToken());

        for (int i = 0; i < n; i++){
            line = reader.readLine();
            tokenizer = new StringTokenizer(line);
            char mode = tokenizer.nextToken().charAt(0);
            int price = Integer.parseInt(tokenizer.nextToken());
            int volume = Integer.parseInt(tokenizer.nextToken());

            if (mode == 'B'){
                if (buyMap.containsKey(price)){
                    volume += buyMap.get(price);
                }
                buyMap.put(price, volume);
            } else if (mode == 'S'){
                if (sellMap.containsKey(price)){
                    volume += sellMap.get(price);
                }
                sellMap.put(price, volume);
            }
        }

        int i = 0;
        ArrayList<String> sellList = new ArrayList<>();
        for(Integer price : sellMap.keySet()){
            if (i == p) break;
            sellList.add("S " + price + " " + sellMap.get(price));
            i++;
        }

        Collections.sort(sellList, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return -s.compareTo(t1);
            }
        });
        sellList.stream().forEach(System.out::println);

        i = 0;
        for(Integer price : buyMap.keySet()){
            if (i == p) break;
            System.out.println("B " + price + " " + buyMap.get(price));
            i++;
        }
    }
}
