public class Perfect_Squares {
    public int numSquares(int n) {
        
        int[] dp=new int[n+1];
        
        dp[0]=0;
        for(int i=1;i<=n;i++){
                int op1=dp[i-1]+1;
                int op2=Integer.MAX_VALUE;
                for(int j=1;j*j<=i;j++){
                    op2=Math.min(op2, dp[i-j*j]+1);
                }
            
            dp[i]=Math.min(op1,op2);
            
        }
        return dp[n];
        
    }
}
