class Climb_Stairs_Minimum_move {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 0, 3, 0, 0 };
        int n = arr.length;

        Integer dp[] = new Integer[n];

        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {

            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                if (dp[i + j] != null) {
                    min = Math.min(min, dp[i + j]);
                }
            }
            if (min != Integer.MAX_VALUE) {
                dp[i] = min + 1;
            }

        }
        if (dp[0] == null) {
            System.out.print(-1);
            return;
        }

        System.out.print(dp[0]);
    }
}