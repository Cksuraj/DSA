class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */


    class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node bst(int data,Node root){
        if(root==null)
        {
            return new Node(data);
            
        }
        
        if(root.data<data){
            root.right=bst(data,root.right);
        }else{
            root.left=bst(data,root.left);
        }
        return root;
    }
    
    Node preorder(Node root,Node ans){
    
        if(root==null)return ans;
    
        ans=preorder(root.left,ans);
        ans=bst(root.data,ans);
        ans=preorder(root.right,ans);
    
        return ans;
    }
    
    Node binaryTreeToBST(Node root)
    
    {
        Node ans=null;
        return preorder(root,ans);
    
    }
}