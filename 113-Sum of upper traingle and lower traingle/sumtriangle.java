//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    class GFG
    {
        public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int n = sc.nextInt();
                
                int matrix[][] = new int[n][n];
                for(int i = 0; i < n; i++)
                    for(int j = 0; j < n; j++)
                        matrix[i][j] = sc.nextInt();
    
                Solution ob = new Solution();
                ArrayList<Integer> ans = ob.sumTriangles(matrix,n);
                for (Integer val: ans) 
                    System.out.print(val+" "); 
                System.out.println();
            }
        }
    }
    // } Driver Code Ends
    //User function Template for Java
    class Solution
    {
        //Function to return sum of upper and lower triangles of a matrix.
        static ArrayList<Integer> sumTriangles(int matrix[][], int n)
        {
         
         ArrayList<Integer> list =new ArrayList<>();
         
         int upsum=0;
         int lowsum=0;
         
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 
                 if(j>=i)                            //dry to get better understanding 
                 upsum+=matrix[i][j];                // upper sum logic
                 
                 if(j<=i)
                 lowsum+=matrix[i][j];                // Lower sum logic
             }
         }      
          list.add(upsum);
          list.add(lowsum);
          return list;       
        }
    }