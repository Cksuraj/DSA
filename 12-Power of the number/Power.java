class Solution
{
         long power(int N,int R)
    {
        // mod for to protect the overflow
        
          long MOD = 1000000007;

// Base Case

        if (R == 0)
            return 1;

        long ans = 1;
        
        long temp = power(N, R / 2);

// Even 
        if (R % 2 == 0) {
            ans = (temp % MOD * temp % MOD) % MOD;
        } 
        //  ODD
        else {
            ans = (N % MOD * temp % MOD * temp % MOD) % MOD;
        }

        return ans;
    }
}