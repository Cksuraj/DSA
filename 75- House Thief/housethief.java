class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int a[], int n)
    {
        // Solving By Dp Approach MEMOIZATION
        int dp[]= new int [n];
        // In starting marking each hous -1 not looted 
        Arrays.fill(dp,-1);
  return recurr(a,0,dp);
    }
    public static int recurr(int arr[], int ind , int  dp[]){
        if(ind>=arr.length) return 0;
        // if the house already looted  , then we will skip 
        if(dp[ind] != -1 )
        return dp[ind];
        
        //  finally calculating and storing into the dp
        return dp[ind]=Math.max(recurr(arr,ind+2 ,dp)+arr[ind],recurr(arr,ind+1,dp));
    }
}