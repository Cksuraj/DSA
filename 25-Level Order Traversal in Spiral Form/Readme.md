## Level Order Traversal In Spiral Form

Question Link: https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1

Given a binary tree and the task is to find the spiral order traversal of the tree.

Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels we print the node's value from right to left and for all the odd levels we print the node's value from left to right. 

For below tree, function should return 1, 2, 3, 4, 5, 6, 7. 

- Example 1:


Input:
      1
    /   \
   3     2

Output:1 3 2

- Example 2:


Input:
           10
         /     \
        20     30
      /    \
    40     60

Output: 10 20 30 60 40 

- Time Complexity: O(N).
- Auxiliary Space: O(N).
