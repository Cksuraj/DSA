## Left and right most node of BST 

Question Link: https://practice.geeksforgeeks.org/problems/leftmost-and-rightmost-nodes-of-binary-tree/1

Given a Binary Tree of size N, Print the corner nodes ie- the node at the leftmost and rightmost of each level.

Input :
         1
       /  \
     2      3
    / \    / \
   4   5  6   7    

Output: 1 2 3 4 7

Explanation:
Corners at level 0: 1
Corners at level 1: 2 3
Corners at level 2: 4 7

Input:

        10
      /    \
     20     30
    / \  
   40  60

Output: 10 20 30 40 60

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(number of nodes in a level)

Constraints:
1 ≤ N ≤ 10^5

