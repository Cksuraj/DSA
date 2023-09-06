class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int ans=-1;
        boolean vis[] = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,adj,vis);
                ans=i;
            }
        }
        
        boolean visit2[]=new boolean [V];
        dfs(ans,adj,visit2);
        for(boolean x:visit2)
        {
            if(!x) ans=-1;
        }
        
        return ans;
    }
    
    void dfs(int node, ArrayList<ArrayList<Integer>>adj, boolean vis[]){
        vis[node]=true;
        
        for(int x:adj.get(node)){
            if(!vis[x]){
                dfs(x,adj,vis);
            }
        }
    }
}