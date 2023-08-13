import java.util.*;

Class Solution{

    static int nthfib(int n){
     if(n<=1){
        return n;
     }

     int mod=1000000007;

    //  let's use dp for better Time Complexcity 

    int dp[]=new int[n+1];
    dp[0]=0; 
    dp[1]=1;
    
    for(int i:n){
        dp[i]=(dp[i-1]+dp[i-2])%mod;
    }
    return dp[n];
    }
}