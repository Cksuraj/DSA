class Solution {
    public static int findCatalan(int n) {
        // code here
        // Nth Catalan number
        
        int mod=1000000007;
        long dp[]=new long[n+1];
        dp[0]=dp[1]=1;
        
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]=(dp[i]+(dp[j]*dp[i-j-1])%mod)%mod;
            }
        }
        return (int)dp[n];
    }
}
        
