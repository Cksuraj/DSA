//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int a[], int n)  
	{  
	      int maxsumis[] = new int[n];   
	      
	      maxsumis[0] = a[0];
     
        int res=maxsumis[0];
        
        // Iterating Over the array
        
        for (int i = 1; i < n; i++)
        {
            maxsumis[i] = a[i];
            for (int j = 0; j < i; j++) {
                
                // Comparing the maxsum of subsequenc
                
                if (a[j] < a[i] && maxsumis[i] < maxsumis[j] + a[i])
                {
                    maxsumis[i] = maxsumis[j] + a[i];
                }
            }
            // Taking Max using Math.max method
             res= Math.max(res, maxsumis[i]);
        }
        return res;//code here.
	}  
}