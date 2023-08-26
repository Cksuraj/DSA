## Longest k Unquie character substring

Question Link : https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

- Input:
S = "aabacbebebe", K = 3
Output: 
7
Explanation: 
"cbebebe" is the longest substring with 3 distinct characters.

- Input: 
S = "aaaa", K = 2
Output: -1
Explanation: 
There's no substring with 2 distinct characters.

- Time Complexity: O(|S|).
- Auxiliary Space: O(|S|).
