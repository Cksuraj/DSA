## Minimum Delestion for the Pailndrom 

Question Link: https://practice.geeksforgeeks.org/problems/minimum-deletitions1648/1

Given a string of S as input. Your task is to write a program to delete the minimum number of characters from the string so that the resultant string is a palindrome.
Note: The order of characters in the string should be maintained.

Input: 
S = "aebcbda"
Output: 
2

Explanation: 
Remove characters 'e' and 'd'.

Input: 

S = "geeksforgeeks"
Output: 
8

Explanation: 
One of the possible result string can be "eefee", so answer is 13 - 5 = 8.

Expected Time Complexity: O(|S|2)
Expected Auxiliary Space: O(|S|2)