## Delete the middle element of the stack

Question link: https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1

Given a stack, delete the middle element of the stack without using any additional data structure.
Middle element:- ceil((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.

- Note: The output shown by the compiler is the stack from top to bottom.
 
- Example 1:

Input: 

Stack = {10, 20, 30, 40, 50}

Output:

ModifiedStack = {10, 20, 40, 50}


Explanation:

If you print the stack the bottom-most element will be 10 and the top-most element will be 50. Middle element will be element at index 3 from bottom, which is 30. Deleting 30, stack will look like {10 20 40 50}.

- Example 2:

Input:

Stack = {10 20 30 40}


Output:

ModifiedStack = {10 30 40}

Explanation:
If you print the stack the bottom-most element will be 10 and the top-most element will be 40. Middle element will be element at index 2 from bottom, which is 20. Deleting 20, stack will look like {10 30 40}.

- Time Complexity: O(N)
- Auxiliary Space: O(N)