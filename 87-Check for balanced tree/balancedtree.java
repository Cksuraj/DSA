class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
   
    boolean isBalance=true;
    boolean isBalanced(Node root)
    {
	// Your code here
	  int leftHeight=findHeight(root.left);
        int rightHeight=findHeight(root.right);
        int diff=Math.abs(leftHeight-rightHeight);
        if(diff<=1 && isBalance)
        {
            return true;
        }else{
            return false;
        }
    }
     public int findHeight(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int leftHeight=findHeight(root.left);
        int rightHeight=findHeight(root.right);
        
        int height=leftHeight>rightHeight?leftHeight+1:rightHeight+1;
        
        int diff=Math.abs(leftHeight-rightHeight);
        if(diff>1)
        {
            isBalance=false;
        }
        
        return height;
    }
}