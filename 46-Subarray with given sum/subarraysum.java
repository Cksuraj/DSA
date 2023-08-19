class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Using Slideing Windoe  
        ArrayList<Integer>al =new ArrayList<>();
        int start=0;
        int end=n;
        int sum=0;
    
        boolean found=false;
    
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>=s){
                end=i;
              while(start<end && s<sum){
                  sum-=arr[start++];
              }
            }
            if(sum==s){
                al.add(start+1);
                al.add(end+1);
                found=true;
                break;
            }
        }
        if(!found)
        al.add(-1);    
         return al;
    }
}