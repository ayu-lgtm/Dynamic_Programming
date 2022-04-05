//import java.util.Arrays;

public class Minimum_cost_Path_Dynamic_programmin {
    public static void main(String args[]) {
        int arr[][] = { { 2, 8, 4, 1, 6, 4, 2 },
                        { 6, 0, 9, 5, 3, 8, 5 },
                        { 1, 4, 3, 4, 0, 6, 5 },
                        { 6, 4, 7, 2, 4, 6, 1 },
                        { 1, 0, 3, 7, 1, 2, 7 },
                        { 1, 5, 3, 2, 3, 0, 9 },
                        { 2, 2, 5, 1, 9, 8, 2 } };

        int m=arr.length;
        int n=arr[0].length;

        int dp[][]=new int[m][n];

        dp[m-1][n-1]=arr[m-1][n-1];

        for(int i=n-2;i>=0;i--){
            dp[m-1][i]=arr[m-1][i]+dp[m-1][i+1];
        }

        for(int i=m-2;i>=0;i--){
            dp[i][n-1]=arr[i][n-1]+dp[i+1][n-1];
        }
        
        for(int i=n-2;i>=0;i--){
            for(int j=m-2;j>=0;j--){
                dp[i][j]=arr[i][j]+Math.min(dp[i][j+1],dp[i+1][j]);
            }
        }

        /*for(int[] x:dp){
            System.out.println(Arrays.toString(x));
        }*/

        System.out.print("From arr[0][0] to arr["+(m-1)+"]["+(n-1)+"] Mininmum Cost : "+dp[0][0]);
        
    }
}
