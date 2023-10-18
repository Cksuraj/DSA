//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) 
    {

//  Let's make a reverse adj list 

    List<List<Integer>> adjlist=new ArrayList<>();
    for(int i=0;i<V;++i){
        adjlist.add(new ArrayList<>());
    }

// Revercie the graph 

   for(int i=0;i<V;++i){
       for(int neg:adj.get(i)){
           adjlist.get(neg).add(i);
       }
   }
   
//   Performing std topo sort 
     List<Integer> ans= new ArrayList<>();
      int ind=0;
      
      Queue<Integer> q=new LinkedList<>();
      
      int indgree[]= new int[V];
      for(int i=0;i<V;i++){
          for(int x:adjlist.get(i))
              indgree[x]++;
          
      }
      
        //2 
        for(int i=0;i<V;i++){
            if(indgree[i]==0)
            q.add(i);
        }
      
      // 3
      while(!q.isEmpty()){
          int u=q.poll();
          ans.add(u);
          
          for(int x:adjlist.get(u))
              if(--indgree[x]==0)
             q.add(x);
          
      }
        //  Java COllections came handy  
         Collections.sort(ans);
         return ans;
    }
}
