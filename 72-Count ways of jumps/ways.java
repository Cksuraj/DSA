class Solution
{

    static int mod=1000000009;
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        long a=1,b=2,c=3;

        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;

        long d=0;

        for(int i=4;i<=n;i++){
            d=(((a%mod+b%mod)%mod)%mod + c%mod) %mod;

            a=b%mod;
            b=c%mod;
            c=d%mod;
        }

        return d%mod;
    }
    
}

