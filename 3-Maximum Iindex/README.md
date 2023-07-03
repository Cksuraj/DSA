## Maximum Index

Question link:https://practice.geeksforgeeks.org/problems/maximum-index3307/1

Given an array arr[] of n positive integers. The task is to find the maximum of j - i subjected to the constraint of arr[i] <= arr[j].

Example 1:

- Input:

n = 9
arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output: 
6
Explanation: 
In the given array arr[1] < arr[7]  satisfying 
the required condition (arr[i] <= arr[j])  thus 
giving the maximum difference of j - i which is
6(7-1).


Example 2:

- Input:

N = 2
arr[] = {18, 17}
Output: 
0

Explanation: 

We can either take i and j as 0 and 0 
or we cantake 1 and 1 both give the same result 0.

- Time Complexity: O(N)
- Auxiliary Space: O(N)

1 ≤ N ≤ 106
0 ≤ Arr[i] ≤ 109