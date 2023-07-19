class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        
        // Creating str to store the S
        StringBuilder str=new StringBuilder(S);
        
        String str1=S;
        
        String str2=str.reverse().toString();
        
        int n=S.length();
        
        int dp[][]=new int [n+1][n+1];
        
        // for loop to check Longest palindromic Subsequency
        
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                 dp[i][j]=0;
                
                // let's check it is pilindrom or not
                else if(str1.charAt(i-1) == str2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                
                else 
                 dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
}