//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int dp[];
    static int palindromicPartition(String str)
    {
    
         int n=str.length();
         
        dp= new int[n];
        
        Arrays.fill(dp,-1);
    
         return helper(str,0,n)-1;
 
    }
    
    // Helper Funtion for partition 
    
    static int helper(String str, int i , int n){
        
        if(i==n) return 0;
        
        if(dp[i]!=-1) return dp[i];
        
        int ans=Integer.MAX_VALUE;
        
        for(int j=i;j<n;j++){
            
            if( pilindrom(str,i,j)){
                
            int cuts=1+helper(str,j+1,n);
            ans=Math.min(cuts,ans);
            }
        }
        return dp[i]=ans;
    }
    
    // Funtion to check Pilindrom 
    
    static boolean pilindrom(String str, int i, int j){
        
        while(i<j){
            if(str.charAt(i)== str.charAt(j)){
                i++;
                j--;
            }
            else 
            return false;
        }
        return true;
    }
}