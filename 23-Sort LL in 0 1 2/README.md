## Given a Linked List sort it in 0's 1's and 2's 

Question Link: https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

- Input:

N = 8

value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2


Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.

- Input:

N = 4
value[] = {2,2,0,1}

Output: 0 1 2 2

Explanation: After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.


- Time Complexity: O(N).
- Auxiliary Space: O(N).
