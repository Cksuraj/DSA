class Solution{
    static int equalPartition(int N, int arr[])
    {
        int totalsum=0;
        
        for(int i=0;i<N;i++)
        totalsum+=arr[i];
        
        if(totalsum%2 !=0)
        return 0;
    
        int sum=totalsum/2;
        
        boolean dp[][] = new boolean[N+1][sum+1];
        
    return fun(0,sum,arr,dp)?1:0;
    
        
    }
    
    static boolean fun(int pos, int sum, int arr[], boolean dp[][]){
        if(sum<0)
        return false;
    
    if(pos==arr.length){
     return sum==0;
    }
      
      if(dp[pos][sum])
      return true;
      
      return dp[pos][sum]=fun(pos+1,sum-arr[pos],arr, dp) ||  fun(pos+1,sum,arr,dp) ;
    }
}