
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        // if(a.length==0){
        //     return 0;
        // }
        int count=0;
         for(int i=0;i<n;i++){
        long product=1;
             for(int j=i;j<n;j++){
                 product = product*a[j];
                 if(product<k)
                 count++;
                 else 
                 break;
             }
         }
         return count;
    }
}