import java.util.*;
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        // using Two Pointer to marge the and swap the array  number
        
         int left=n-1;
      int right=0;
      long t=0;
      while(left>=0 && right < m)
      {
          if(arr1[left] > arr2[right])
          {
        // Swaping the array number 
          
              t=arr1[left];
              arr1[left]=arr2[right];
              arr2[right]=t;
              right++;
              left--;
          }
          else
          {
              break;
          }
      }
      
      Arrays.sort(arr1);
      Arrays.sort(arr2);
        
    }
}