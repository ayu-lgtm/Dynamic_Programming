

public class LCS {
    public static void main(String args[]) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        //int len =RECURSION_SOLUTION(s1,s2,s1.length(),s2.length());

        //System.out.print(len);


        //Tabular Solution()
        int dp[][]=new int[s1.length()+1][s2.length()+1];

        
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        System.out.print(dp[s1.length()][s2.length()]);

    }
    public static int RECURSION_SOLUTION(String s1,String s2,int m,int n){
        if(m==0 || n==0){
            return 0;
        }
        else if(s1.charAt(m-1)==s2.charAt(n-1)){
            return   1+ RECURSION_SOLUTION(s1, s2, m-1, n-1);
        }
        else{
            return Math.max(RECURSION_SOLUTION(s1, s2, m-1, n),RECURSION_SOLUTION(s1, s2, m, n-1));
        }
    }
}
