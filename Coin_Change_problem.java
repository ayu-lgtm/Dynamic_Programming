public class Coin_Change_problem {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        int sum = 4;

        int dp[][] = new int[arr.length + 1][sum + 1];

        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0) {
                    dp[i][j] = 0;
                } else if (j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= arr[i - 1]) {
                        dp[i][j] += dp[i][j - arr[i - 1]];
                    }
                }
            }
        }
        System.out.print(dp[arr.length][sum]);
    }
}
