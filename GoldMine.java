//import java.util.Arrays;

public class GoldMine {
    public static void main(String args[]) {
        int arr[][] = { { 0, 1, 4, 2, 8, 2 },
                { 4, 3, 6, 5, 0, 4 },
                { 1, 2, 4, 1, 4, 6 },
                { 2, 0, 7, 3, 2, 2 },
                { 3, 1, 5, 9, 2, 4 },
                { 2, 7, 0, 8, 5, 1 } };

        int m = arr.length;
        int n = arr[0].length;

        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][n - 1] = arr[i][n - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    dp[j][i] = arr[j][i] + Math.max(dp[j][i + 1], dp[j + 1][i + 1]);
                } else if (j == m - 1) {
                    dp[j][i] = arr[j][i] + Math.max(dp[j][i + 1], dp[j - 1][i + 1]);
                } else {
                    dp[j][i] = arr[j][i] + Math.max(Math.max(dp[j][i + 1], dp[j - 1][i + 1]), dp[j + 1][i + 1]);
                }
            }
        }

        /*
         * for(int[] x:dp){
         * System.out.println(Arrays.toString(x));
         * }
         */

        int max = Integer.MIN_VALUE;
        for (int x = 0; x < m; x++) {
            if (max < dp[x][0]) {
                max = dp[x][0];
            }
        }

        System.out.print(max);
    }
}
