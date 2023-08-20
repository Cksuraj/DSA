//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        
        // 1st approach to solvee in big O(N);
        
    //     if(x==0) return 0;
    //     int count=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==x)
    //         count++;
    //     }
    // return count;
    
    //  2nd Approach 
    
    int cnt =0;

    HashMap<Integer,Integer> div =new HashMap<>();
    
    for(int i=0;i<n;i++)
        div.put(arr[i],div.getOrDefault(arr[i],0)+1);

    for(Map.Entry<Integer,Integer> j : div.entrySet())
    {
        if(j.getKey()==x)
        cnt=j.getValue();
    }
    return cnt;
    }
}