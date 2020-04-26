package CodeForces.Homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Task_D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringTokenizer token = new StringTokenizer(line);
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());
        int[][] map = new int[n][m + 2];
        for (int i = 0; i < n; i++){
            line = reader.readLine();
            for (int j = 0; j < m + 2; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int time = 0;

        int xPos = 0;
        int yPos = n - 1;

        boolean isInLeft = true;
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < m + 2; i++){
            int curr = map[yPos][i];
            if (curr == 1){
                if (leftIndex == 0){
                    leftIndex = i;
                }
                rightIndex = i;
            }
        }

        for (int k = 0; k < n - 1; k++){
            if (isInLeft){
                time += (rightIndex - xPos);
                xPos = rightIndex;
            } else {
                time += (xPos - leftIndex);
                xPos = leftIndex;
            }

            leftIndex = 0;
            rightIndex = 0;

            for (int i = 0; i < m + 2; i++){
                int curr = map[yPos - 1][i];
                if (curr == 1){
                    if (leftIndex == 0){
                        leftIndex = i;
                    }
                    rightIndex = i;
                }
            }

            int rightWay = (m + 1 - xPos) + 1 + (m + 1 - rightIndex);
            int leftWay = (xPos) + 1 + (leftIndex);

            if (rightWay < leftWay){
                time += (m + 2 - xPos);
                isInLeft = false;
                xPos = m + 1;
            } else {
                time += (xPos + 1);
                isInLeft = true;
                xPos = 0;
            }

            yPos--;
        }

        if (isInLeft){
            time += rightIndex;
        } else {
            time += (m + 1) - leftIndex;
        }
        System.out.println(time);
    }
}
