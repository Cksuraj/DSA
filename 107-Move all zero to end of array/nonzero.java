//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {

        // 1st create a temp array consistin the arr length
        // 2nd create varibale index to keep trak of 0 and non-zero element
        // 3rd run for loop for non-zero and 0 to handle the case
        // add back to the array

        // 1st
        int temp[] = new int[n + 1];
        int index = 0;

        // 3rd

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // to handle the 0th case

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // adding back to array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}