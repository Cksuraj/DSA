//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String betterString(String str1, String str2) {
      int a=coutSub(str1);
      int b=coutSub(str2);
      if(b>a) return str2;
      else return str1;
    }
    
    static int coutSub(String str){
        int n=str.length();
        int dp[]=new int[n+1];  
        
        Map<Character, Integer> map=new HashMap<>();
        
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=2*dp[i-1];          // by observing the pattern on subsequence
            
            if(map.containsKey(str.charAt(i-1))){
                dp[i]=dp[i]-dp[map.get(str.charAt(i-1))];
            }
            map.put(str.charAt(i-1),(i-1));
        }
        return dp[n];
    }
}