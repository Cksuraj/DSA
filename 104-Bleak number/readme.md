## Bleak Number

Question Link:https://practice.geeksforgeeks.org/problems/bleak-numbers1552/1

Given an integer, check whether it is Bleak or not.

A number n is called Bleak if it cannot be represented as sum of a positive number x and set bit count in x, i.e., x + countSetBits(x) is not equal to n for any non-negative number x.

Example 1:

Input: 
4
Output: 
1

Explanation: 
There is no x such that x + countSetbit(x) = 4
Example 2:

Input: 
3
Output: 
0

Explanation: 
3 is a Bleak number as 2 + countSetBit(2) = 3.


Expected Time Complexity: O(log(n) * log(n))
Expected Space Complexity: O(1)
 