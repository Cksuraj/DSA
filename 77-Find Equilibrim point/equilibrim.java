class Solution {    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
     
     long sum=0;
     if(n==1) return 1;
     
     for(int i=0;i<n;i++){
         sum+=arr[i];
     }

     long lsum=0;   
     for(int i=0;i<n;i++){
        if(lsum == sum-arr[i])
        return i+1;
        
        lsum+=arr[i];
        sum-=arr[i];
     }
    return -1;
}
}