class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int k)
    {
        ArrayList<Integer> al=new ArrayList<>();
        inorder(root,al);
        if(k>al.size())
        return -1;
        return al.get(al.size()-k);
        
    }
    
    // Inorder Traversal recurrsion  
    
    static void inorder(Node root, ArrayList<Integer> al){
        if(root!=null){
        inorder(root.left,al);
        al.add(root.data);
        inorder(root.right,al);
        }
    }
}