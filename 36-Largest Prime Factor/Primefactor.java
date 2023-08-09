//{ Driver Code Starts
//Initial Template for Java

// GeeksforGeek Platform 

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long largestPrimeFactor(int N) {
        
     long num=2;
    //  while loop until we found the answser
    // To Understand a Better do a dryRun one Pepar and pen. 
    while((num*num) <=N){
        if(N%num==0)
         N/=num;
         else 
         num++;
    }
        return N;
    }
}