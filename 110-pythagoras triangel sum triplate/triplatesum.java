
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    boolean checkTriplet(int[] arr, int n) {
    
        // [2,3,4,5,7]
    //  1st Brust Forse approach  a , b , c than compare     
    // Base Case 
    if(n<=1) return false;

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(ing k=j+1;k<n;j++){

                // taking square of a , b , c
                int a=arr[i]* arr[i];
                int b=arr[j]* arr[j];
                int c=arr[k]* arr[k];

                // let's check it is 3sum or not 

                if( a == b + c || b == a + c || c == a + b )
                return true;
            }
        }
    }
       return false;
    }
}

// mathod 2 Using HashSet Timecomplexcity O(n*n) 

 boolean checkTriplet(int[] arr, int n) {
        // code here
        // Using Hashset we can find  the triplate sum 
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(arr[i]*arr[i]);
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int c=arr[i]*arr[i] + arr[j]*arr[j];
                
                if(set.contains(c))
                return true;
            }
        }
        return false;
    }

// 3rd mathod Using two pointer appraoch 

