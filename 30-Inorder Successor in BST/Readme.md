## Inorder Successor in BST

Question link: https://docs.google.com/spreadsheets/d/1zH0xhP1Be0T9l52aye0Tm3DyFwkyFXCzNGaUb2WAnYw/edit#gid=0

Given a BST, and a reference to a Node x in the BST. Find the Inorder Successor of the given node in the BST.
 

Example 1:

Input:
      2
    /   \
   1     3
K(data of x) = 2
Output: 3 
Explanation: 
Inorder traversal : 1 2 3 
Hence, inorder successor of 2 is 3.

Example 2:

Input:
             20
            /   \
           8     22
          / \
         4   12
            /  \
           10   14
K(data of x) = 8
Output: 10

Explanation:
Inorder traversal: 4 8 10 12 14 20 22
Hence, successor of 8 is 10.
 

- Time Complexity: O(Height of the BST).
- Auxiliary Space: O(1).

