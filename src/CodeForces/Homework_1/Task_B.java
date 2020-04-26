package CodeForces.Homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeMap;
/*
5
tourist reposted Polycarp
Petr reposted Tourist
WJMZBMR reposted Petr
sdya reposted wjmzbmr
vepifanov reposted sdya
 */

public class Task_B {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Integer> repostMap = new TreeMap<>();
        repostMap.put("polycarp", 1);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());

        for (int i = 0; i < n; i++){
            line = reader.readLine();
            tokenizer = new StringTokenizer(line);
            String newReposter = tokenizer.nextToken().toLowerCase();
            String reposted = tokenizer.nextToken().toLowerCase();
            String oldReposter = tokenizer.nextToken().toLowerCase();

            int oldLength = repostMap.get(oldReposter);
            repostMap.put(newReposter, oldLength + 1);
        }

        String maxRepost = repostMap.keySet().stream().max(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return repostMap.get(s) - repostMap.get(t1);
            }
        }).get();

        System.out.println(repostMap.get(maxRepost));
    }
}
