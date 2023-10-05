//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // Using HashMap key and Value pair 

        HashMap<Character, Integer > map=new HashMap<>();
        map.put('I', 1); 
        map.put('V', 1); 
        map.put('X', 1); 
        map.put('L', 1); 
        map.put('C', 1); 
        map.put('D', 1); 
       int n=str.length();    
    int ans=0;
        for(int i=0;i<n-1;i++){
            if(map.get(str.charAt(i)<str.charAt(i+1)))
            ans-=map.get(str.charAt(i));
            else 
            ans+=map.get(str.charAt(i));
        }
        ans+=map.get(str.charAt(n-1));
        return ans;
    }
}