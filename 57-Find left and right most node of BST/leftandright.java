class Tree
{
    public static void printCorner(Node node)
    {
        
        Queue<Node> al =new LinkedList<>();
        Node root=node;
        al.add(root);
        
        while(!al.isEmpty()){
            
            int n=al.size();
            
            for(int i=0;i<n;i++){
                
                Node temp=al.poll();
                if(i==0 || i==n-1)
                System.out.print(temp.data+" ");
                
                if(temp.left!=null)
                    al.add(temp.left);
                
                if(temp.right!=null)
                    al.add(temp.right);
                
            }
        }
    }
   
}