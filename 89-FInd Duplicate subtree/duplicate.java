//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GFG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root){
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t > 0){
            String s = br.readLine();
	    	Node root = buildTree(s);
	    	
            Solution ob = new Solution();
    		System.out.println(ob.dupSub(root));
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/* A Binary Tree node

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    
    // Global variable 
    
    String duplicate= "*";
    HashSet<String> subtree=new HashSet();
    
    int dupSub(Node root) {
        String str=dup(root);
        // $ symbol for duplicate is present 
        if(str.equals("$"))
        return 1;
        else 
        return 0;
    }
    
    String dup(Node root){

        StringBuilder s= new StringBuilder();   // Timecomplexcity O(n) for StringBuilder 
        s.append("");
        
        if(root==null)
        return s.append(duplicate).toString(); 
        
        
        String lstr= dup(root.left);
        if(lstr.equals("$"))       // Checking left side of Subtree 
        return "$";
        
        String rstr=dup(root.right);; 
        if(rstr.equals("$"))        // let's find duplicate subtree Checking right side of Subtree
        return "$";
        
        s=s.append(root.data).append(lstr).append(rstr);   // Marging the node left and right 
        
        if(s.length() >3 && subtree.contains(s.toString()))
        
        return "$";
        
        subtree.add(s.toString());
        
        return s.toString();
        
    }
}