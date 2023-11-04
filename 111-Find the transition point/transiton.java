//{ Driver Code Starts
    import java.util.*;

    class Sorted_Array {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                Solution obj = new Solution();
                System.out.println(obj.transitionPoint(arr, n));
                T--;
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
        int transitionPoint(int arr[], int n) {
            // code here
            
            int i=0;               // start from 0 index of array
            int j=n-1;             // Start from the last index of the array
            
            int first=-1;   //Transition point 
            
            while(i<=j){            // Binary search log(n);
                int mid=(i+j)/2;
                
                if(arr[mid]==1){
                    first=mid;
                    j=mid-1;
                }
                else if(arr[mid]==0){
                    i=mid+1;
                }
            }
            return first;
        }
    }