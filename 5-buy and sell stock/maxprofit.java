
class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        
        // Calculating the phyada  
        
       int phyada=0;

       for(int i=1;i<n;i++){
           //here if  we buy at day 1 and sell it on day 2 then
           
        if(prices[i]>prices[i-1])
       phyada += prices[i]-prices[i-1];
       }       
       return phyada;
    }
}
        
