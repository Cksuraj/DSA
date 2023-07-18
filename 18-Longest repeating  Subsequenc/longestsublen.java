class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int len=str.length();
        
        int ans[][]=new int[len+1][len+1];
        
        for(int i=len;i>=0;i--){
            for(int j=len;j>=0;j--){
                
                if(i==len)
                {
                 ans[0][0]=0;
                }
                else if( j==len ){
                  ans[0][0]=0;   
                } 
                else{
                 
                if (str.charAt(i)==str.charAt(j) && i!=j){
                    ans[i][j]= ans[i+1][j+1] +1;
                    
                }
                else{
                    ans[i][j]=max(ans[i+1][j],ans[i][j+1]);
                    
                }
        
                 
            }
        }
        }
        
        return ans[0][0];
        
    }
    
        static int max(int a,int b){
            if(a>b) return a;
            return b;
        }
}