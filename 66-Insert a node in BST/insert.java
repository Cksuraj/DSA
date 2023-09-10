

class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        // your code here
        
        if(root==null)
        root=new Node(key);
        
        if(key<root.data){
            root.left=insert(root.left,key);
        }
        else if(key>root.data){
            root.right=insert(root.right,key);
        }
        return root;
        
    }
}