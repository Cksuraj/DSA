//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while (T-- > 0) {
                String[] s = br.readLine().trim().split(" ");
                int n = Integer.parseInt(s[0]);
                int[] nums = new int[n];
                for (int i = 0; i < n; i++) {
                    nums[i] = Integer.parseInt(s[i + 1]);
                }
                int k = Integer.parseInt(br.readLine().trim());
                Solution obj = new Solution();
                int[] ans = obj.topK(nums, k);
                for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
                System.out.println();
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        public int[] topK(int[] nums, int k) {
            // Code here
           // Storing the frequency of elements in array
           
           Map<Integer,Integer> map =new HashMap<>();
           
           for(int i:nums){
           map.put(i,map.getOrDefault(i,0)+1);
           }
           
       PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
        (a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return a.getValue() - b.getValue();  // Sort by values in ascending order
            } else {
                return a.getKey() - b.getKey(); // If values are the same, sort by keys in descending order
            }
        }
    );
    
             // Now let's iterat over the keyset 
             
             for(Map.Entry<Integer, Integer> ele:map.entrySet()){
                 pq.add(ele);
                 if(pq.size()>k)
                 pq.poll();
             }
             
             int ans[]=new int[k];
             int idx=k-1;
             
             while(!pq.isEmpty()){
                 ans[idx--]=pq.poll().getKey();
             }
             return ans;
        }
    }