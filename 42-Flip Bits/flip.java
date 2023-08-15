class Solution {

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        
        int c=0; 
        int result=0;
        int zero=0;
        
        for(int i=0;i<n;i++){
            if(a[i]==1){
                result++;
                zero--;
                if(zero<0)
                zero=0;
            }
            else if(a[i]==0){
                zero++;
                c=Math.max(c,zero);
            }
        }
        
            result+=c;
        return result;
    }
}
