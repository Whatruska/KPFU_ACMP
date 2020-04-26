package CodeForces.Homework_1;

import java.util.Scanner;

public class Task_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                map[i][j] = scanner.nextInt();
            }
        }
        countMatrix(map);
        System.out.println(map[0][0]);
    }

    public static void countMatrix(int[][] matrix){
        count(matrix.length - 1, matrix.length - 1, matrix);
    }

    public static void count(int x, int y, int[][] map){
        int maxVal = map[y][x];
        if (x == map.length - 1 && y == map.length - 1){
            for (int i = x - 1; i >= 0; i--){
                maxVal = Math.max(maxVal, maxVal + map[y][i]);
                map[y][i] = maxVal;
            }
        } else {
            for (int i = x - 1; i >= 0; i--){
                maxVal = Math.max(maxVal, map[y][i] + Math.max(map[y + 1][i], map[y][i + 1]));
                map[y][i] = maxVal;
            }
        }
        if (y > 0) {
            map[y - 1][x] += map[y][x];
            count(x, y - 1, map);
        }
    }
}
