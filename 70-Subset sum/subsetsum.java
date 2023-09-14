class Solution{
	int mod=1000000007;
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    
	    int dp[][] = new int [n + 1][sum + 1];
	    
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=sum;j++){
	            dp[i][j]= -1;
	        }
	        
	    }
	    
	    return fun(0,sum, arr,dp);
	    
	} 
	int fun(int pos, int sum , int arr[] , int dp[][]){
	    
	    if(sum<0) return 0;
	    
	    if(pos==arr.length)
	    return sum==0?1:0;
	    
	    if(dp[pos][sum]!=-1)
	    return dp[pos][sum];
	    
	    dp[pos][sum] = (fun(pos+1,sum,arr,dp)%mod + 
	                   fun(pos+1,sum-arr[pos],arr,dp)%mod)%mod;
     
     return dp[pos][sum];
	}
	
	
}