//import java.util.Arrays;

public class Target_Sum_Problem {
    public static void main(String args[]){
        int arr[]={4,2,7,1,3};
        int target=10;

        int m=arr.length;

        boolean dp[][]=new boolean[m+1][target+1];

        dp[0][0]=true;

        for(int i=1;i<=m;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=m;i++){
            dp[0][i]=false;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=target;j++){
                if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
                else{
                    int var=arr[i-1];
                    if(j>=var){
                        if(dp[i-1][j-var]==true){
                            dp[i][j]=true;
                        }
                    }
                }
            }
        }

        /*for(boolean[] x:dp){
            System.out.println(Arrays.toString(x));
        }*/

        System.out.print(dp[m][target]);

    }
}
