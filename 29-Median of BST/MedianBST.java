class Tree
{
    public static float findMedian(Node root)
    {
        // code here.
       if(root==null) return 0;
      List<Integer> al=new ArrayList<>();
      inorder(al,root);
      int n=al.size();
      
      if(n%2 !=0){
       return al.get((n+1)/2-1); 
    }
    else{
        int mid1=al.get(n/2-1);
        int mid2=al.get(n/2);
        
        return ((float)(mid1+mid2)/2);
    }
    
    }
    // let's do inorder traversal to get all element in list
    
    static void inorder(List<Integer>al, Node root){
        
        // Base Case 
        if(root==null)
        return;
        
        inorder(al,root.left);
        al.add(root.data);
        inorder(al,root.right);
        
    }
}