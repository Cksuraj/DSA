// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
        
        // N belongs to number of coinds
        // sum belongs to sum
        // Inisilizing the Dp 
        
        long dp[][]= new long[N+1][sum+1];
        
        // Base Case 
        for(int i=0;i<=N;i++){
            dp[i][0]=1;
        }
        
        for(int j=1;j<=sum;j++){
            dp[0][j]=0;
        }
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=sum;j++){
                // Vailed case that will be inclued int answser
                if(coins[i-1] <=j){
                    
                    dp[i][j]=dp[i][j-coins[i-1]] + dp[i-1][j];
                }
                else{
                    // Exclued case
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[N][sum];
        
    }
}