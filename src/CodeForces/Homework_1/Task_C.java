package CodeForces.Homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
0 43 21 18 2
3 0 21 11 65
5 2 0 1 4
54 62 12 0 99
87 64 81 33 0
 */

public class Task_C {
    static int[] perms = {
            112345,
            212354,
            312435,
            412453,
            512534,
            612543,
            713245,
            813254,
            913425,
            1013452,
            1113524,
            1213542,
            114235,
            1414253,
            1514325,
            1614352,
            1714523,
            1814532,
            1915234,
            2015243,
            2115324,
            2215342,
            2315423,
            2415432,
            2521345,
            2621354,
            2721435,
            221453,
            2921534,
            3021543,
            3123145,
            3223154,
            323415,
            3423451,
            3523514,
            3623541,
            3724135,
            3824153,
            3924315,
            4024351,
            4124513,
            4224531,
            4325134,
            4425143,
            4525314,
            4625341,
            4725413,
            4825431,
            4931245,
            5031254,
            531425,
            5231452,
            5331524,
            5431542,
            5532145,
            5632154,
            5732415,
            5832451,
            532514,
            6032541,
            6134125,
            6234152,
            6334215,
            6434251,
            6534512,
            6634521,
            6735124,
            635142,
            6935214,
            7035241,
            7135412,
            7235421,
            7341235,
            7441253,
            7541325,
            7641352,
            7741523,
            7841532,
            7942135,
            8042153,
            8142315,
            8242351,
            8342513,
            8442531,
            843125,
            8643152,
            8743215,
            8843251,
            8943512,
            9043521,
            9145123,
            9245132,
            945213,
            9445231,
            9545312,
            9645321,
            9751234,
            9851243,
            9951324,
            10051342,
            10151423,
            10251432,
            10352134,
            10452143,
            10552314,
            10652341,
            10752413,
            10852431,
            10953124,
            11053142,
            11153214,
            11253241,
            11353412,
            11453421,
            11554123,
            11654132,
            11754213,
            11854231,
            11954312,
            12054321,
    };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int size = 5;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++){
            String line = reader.readLine();
            StringTokenizer token = new StringTokenizer(line);
            for (int j = 0; j < size; j++){
                matrix[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        int maxSum = -1;

        for (int j = 0; j < perms.length; j++) {
            int comb = perms[j];
            StringBuilder builder = new StringBuilder(comb + "");
            while (builder.length() > 5) {
                builder.deleteCharAt(0);
            }
            int sum = 0;
            String perm = builder.toString();
            for (int i = 0; i < perm.length() - 1; i++) {
                int d1 = perm.charAt(i) - '0' - 1;
                int d2 = perm.charAt(i + 1) - '0' - 1;
                int el1 = matrix[d1][d2];
                int el2 = matrix[d2][d1];
                int s = el1 + el2;
                sum += s;
                if (i > 1) {
                    sum += s;
                }
            }

            if (sum > maxSum){
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}
