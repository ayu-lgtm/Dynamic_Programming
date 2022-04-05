public class Edit_Distance_Problem {
    public static void main(String args[]) {
        String s1 = "CAT";
        String s2 = "CUT";

        // Recursive solution
        // System.out.print(Recursive_Solution(s1,s2,s1.length(),s2.length()));

        int dp[][] = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = i;
                } else if (j == 0) {
                    dp[i][j] = j;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }

        System.out.print(dp[s1.length()][s2.length()]);
    }

    public static int Recursive_Solution(String s1, String s2, int m, int n) {
        if (m == 0) {
            return n;
        } else if (n == 0) {
            return m;
        } else if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return Recursive_Solution(s1, s2, m - 1, n - 1);
        } else {
            return 1 + Math.min(Recursive_Solution(s1, s2, m - 1, n - 1),
                    Math.min(Recursive_Solution(s1, s2, m - 1, n), Recursive_Solution(s1, s2, m, n - 1)));
        }
    }
}
