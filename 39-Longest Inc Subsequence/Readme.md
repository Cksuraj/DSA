## Longest Increassing Subsequence 

Question Link: https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1

Given an array of integers, find the length of the longest (strictly) increasing subsequence from the given array.

- Input:
N = 16
A = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15}
Output: 
6

Explanation:
There are more than one LIS in this array. One such Longest increasing subsequence is {0,2,6,9,13,15}.

- Input:
N = 6
A[] = {5,8,3,7,9,1}
Output: 
3

Explanation:
There are more than one LIS in this array.  One such Longest increasing subsequence is {5,7,9}.

- Time Complexity : O( N*log(N) )
- Auxiliary Space: O(N)