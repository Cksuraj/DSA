class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	
   // let's use traversal variables for spiral matrix;
   
   int top=0; int left=0; int right=m-1;
   int bottom=n-1;
   
    int cnt=0;
    
//   using  while loop for traversal 
	  
	  while(top<=bottom && left<=right){
	      
	   //   traversing on 1st row left to right
	   
	   for(int i=left;i<=right;i++){
	       cnt++;
	       if(cnt==k)
	       return A[top][i];
	   }
	   top++;
	   
	   // traversing on last row
	   for(int i=top;i<=bottom;i++){
	       { 
	           cnt++;
	       if(cnt==k)
	       return A[i][right];
	       }
	   }
	   right--;
	   
	   //Traversing right to left 
	   if(top<=bottom){
	       for(int i=right;i>=left;i--){
	           cnt++;
	           if(cnt==k)
	           return A[bottom][i];
	       }
	       bottom--;
	   }
	   
	   
	   // traversing bottom to top 
	   
	   if(left<=right){
	       for(int i=bottom;i>=top;i--){
	           cnt++;
	           if(cnt==k)
	           return A[i][left];
	       }
	       left++;
	   }
	  }
	  return 0;
    }
}