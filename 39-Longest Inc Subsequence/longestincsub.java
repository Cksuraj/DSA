class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // Arraylist to  a[] elements 
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a[0]);
        int len = 1;
        // comparing the a with last index of ans
        for (int i = 1; i < size; i++) {
            if (a[i] > ans.get(ans.size() - 1)) {
                ans.add(a[i]);
                len++;
            } else {
                int indx = Bs(ans, a[i]);
                ans.set(indx, a[i]);
            }
        }
        return len;
    }
    
    static int Bs(ArrayList<Integer> ans, int key) {
        int low = 0;
        int high = ans.size() - 1;
        
        // Binary Search
        while (low <= high) {
        // 1st step to mark the mid elemetn
            int mid = low + (high - low) / 2;
            
            // if key found at mid return mid
            if (ans.get(mid) == key) return mid;
            
            // Searching to Right side mid+1;
            else if (ans.get(mid) < key) {
                low = mid + 1;
            } else
            //   Searching to left Side left-1;
            {
                high = mid - 1;
            }
        }
        return high + 1;
    }
        // code here
    
} 