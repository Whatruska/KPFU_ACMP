package CodeForces.Homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Task_G {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        int[] arr = new int[n];

        int minSum = 0;
        int minInd = k - 1;

        line = reader.readLine();
        StringTokenizer token = new StringTokenizer(line);

        int currSum = minSum;
        int last = 0;

        for (int i = 0; i < n; i++){
            int elem = Integer.parseInt(token.nextToken());
            arr[i] = elem;
            if (i < k){
                currSum += elem;
                minSum = currSum;
            } else {
                currSum -= arr[last];
                currSum += elem;
                last++;
                if (currSum < minSum){
                    minSum = currSum;
                    minInd = i;
                }
            }
        }
        System.out.println(minInd - k + 2);
    }
}
