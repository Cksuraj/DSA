//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
    // 2nd approach 
    int r[]= new int[n];
    int l[]=new int[n];
    // intilize with index
    l[0]=arr[0];
    r[n-1]=arr[n-1];
    // let's calculate left max and right max
    // left to right 
    for(int i=1;i<n;i++)
        l[i]=Math.min(arr[i],l[i-1]);
    
    // right to left
    for(int j=n-2;j>=0;j--)
        // why j+1 we are movint right to left
        r[j]=Math.max(arr[j],r[j+1]);
    
    // using Two pointer to calculate ans
    
    int i=0; 
    int j=0;
    // ans with min positive integer
    int ans=Integer.MIN_VALUE;
    
    while(i<n && j<n)
    {
        if(left[i]<=right[j]){
            ans=Math.max(ans,j-i);
            j++;
        }
        else
            i++;
    }
    return ans;
    }
}
