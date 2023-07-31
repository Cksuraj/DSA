class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        // arraylist to store the elements
        ArrayList<Integer>al = new ArrayList<>();
        
        // queue to add the elements
        
        Queue<Integer> q =new LinkedList<>();
        
        // to mark as visited
        
        boolean vis[] =new boolean[V];
        
        // adding first node  
        q.add(0);
        
        vis[0]=true; // mark as true 
        
       while(!q.isEmpty()){
           int curr= q.poll();
           al.add(curr);
           
           for(int neghibour:adj.get(curr)){
               if(!vis[neghibour]){
                    vis[neghibour]=true;
                    q.add(neghibour);
               }
           }
       }
       
           return al;
    }
}