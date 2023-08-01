class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code her
        //  to store the elements in array fomate 
        ArrayList<Integer> al = new ArrayList<>();
        
        boolean vis[]  = new boolean[V] ; // mark visited
        
        // Recursive call 
        dfs(0, vis, al , adj);
        return al;
        
    }
    
    public void dfs(int curr , boolean[] vis  , ArrayList<Integer> al , ArrayList<ArrayList<Integer>> adj)
    {
        vis[curr] = true;
        al.add(curr);
        
        
        for( int i = 0 ; i<adj.get(curr).size() ; i++) 
        //  if the neghibour is not visited then visiting the neghibour and doing recursive call 
          if(!vis[adj.get(curr).get(i)]) 
                dfs(adj.get(curr).get(i) , vis, al , adj);
    }
}