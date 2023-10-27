//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static int memo[][];
    static int minimumNumberOfDeletions(String S) {
        //your code here
        
        // Let's Optimised the solution 
        int n=S.length();
        
        memo =new int[n][n];
        
        for(int i=0;i<n;i++){
            Arrays.fill(memo[i],-1);
        }
            
    return miniopration(S,0,n-1);
    }
    
    // Using 2D memoization to optimized the probleam solution 
    
    static int miniopration(String S, int i, int j){
        if(i>=j) return 0;
        
        if(memo[i][j]!=-1)
        return memo[i][j];
        
        if(S.charAt(i)==S.charAt(j)){
            return miniopration(S,i+1,j-1);
        }
        
        return memo[i][j]=1+Math.min((miniopration(S,i+1,j)),(miniopration(S,i,j-1)));
        
    }
    
    
    
}