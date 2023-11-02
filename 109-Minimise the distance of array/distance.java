//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        
      
      int last_x=-1;
      int last_y=-1;
      int ans=Integer.MAX_VALUE;
      
      // for loop to itrate over the array and find the x and y
      
      for(int i=0;i<n;i++){
          if(a[i]==x){                                  // here x is found and update as last 
              last_x=i;
              if(last_y!=-1)
              ans=Math.min(ans,Math.abs(last_x-last_y));  // min and abs diffrenace taken 
          }
          
          else if(a[i]==y){                                // here y is found and update as last 
              last_y=i;
              if(last_x!=-1)                                        
              ans=Math.min(ans,Math.abs(last_x-last_y));    // min and abs diffrenace is taken   
          }
      }
      
      return ans==Integer.MAX_VALUE?-1:ans;     // finaly ans is return 
    }
}