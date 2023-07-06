## Quick Sort (IMP)

Question link: https://practice.geeksforgeeks.org/problems/quick-sort/1

Quick Sort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.
Given an array arr[], its starting position is low (the index of the array) and its ending position is high(the index of the array).

Note: The low and high are inclusive.

Implement the partition() and quickSort() functions to sort the array.

Example 1:
- Input:

N = 5 
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9

Example 2:
- Input: 

N = 9
arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7}
Output:
1 1 2 3 4 6 7 9 10

-  Time Complexity: O(N*logN)
-  Auxiliary Space: O(logN)

Constraints:
1 <= N <= 103
1 <= arr[i] <= 104

