import java.util.Arrays;

public class Climb_stairs_with_variable_jumps {
    public static void main(String args[]){
        int jumps[]={3,3,0,2,2,3};
        int dp[]=new int[jumps.length+1];

        dp[jumps.length]=1;

        for(int i=jumps.length-1;i>=0;i--){
            for(int j=1;j<=jumps[i] && i+j<dp.length;j++){
                dp[i]+=dp[i+j];
            }
        }

        System.out.print("All possible path with given jumps from each stairs are :"+Arrays.toString(dp));
    }
}
