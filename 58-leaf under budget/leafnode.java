
/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    ArrayList<Integer> al;
    public int getCount(Node node, int bud){
        al=new ArrayList<>();
        
        vis_leafnode(node,0);
        
        int counter=0;
        
        Collections.sort(al);
        
        for(int i=0;i<al.size();i++){
            if(bud-al.get(i) >=0 ){
                counter++;
                bud-=al.get(i);
            }
            else {
                return counter;
            }
        }
        
             return counter;
        
    }
    
    void vis_leafnode(Node node, int level){
        
        if(node==null) return ;
        level++;
        
        if(node.left==null && node.right==null){
            al.add(level);
            level++;
        }
        else{
        vis_leafnode(node.left,level);
        vis_leafnode(node.right,level);
        }
    }
}