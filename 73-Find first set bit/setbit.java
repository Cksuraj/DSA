class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        
            if(n==0) return 0;
        
            int cnt=0;     
             while(n>0){
                 cnt++;
                 if((n%2)==1)
                 return cnt;
                 
                 n=n/2;
             }         
             
            return 0;
    }
}