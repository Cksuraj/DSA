//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(a[i]);

            Solution ob = new Solution();
            System.out.println(ob.isPossible(N, arr));
        }
    }
}


// User function Template for Java

class Solution {
    static int isPossible(int N, int arr[]) {
      
      long sum=0; 
      // forming a number Digit 
      
      for(int i: arr) sum+=i;
      
      // Checking is it divisible or not 
      
      if(sum%3==0)
      return 1;
      else 
      return 0;
    }
}