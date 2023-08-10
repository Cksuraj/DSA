## Longest Common Subsequence

Question link: https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1

Given two strings, find the length of longest subsequence present in both of them. Both the strings are in uppercase latin alphabets.

Example 1:

- Input:

A = 6, B = 6
str1 = ABCDGH
str2 = AEDFHR

Output: 3

Explanation: LCS for input strings “ABCDGH” and “AEDFHR” is “ADH” of length 3.
Example 2:

- Input:
A = 3, B = 2
str1 = ABC
str2 = AC

Output: 2

Explanation: LCS of "ABC" and "AC" is "AC" of length 2.

- Time Complexity : O(|str1|*|str2|)
- Auxiliary Space: O(|str1|*|str2|)