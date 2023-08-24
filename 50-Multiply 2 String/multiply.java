class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        return String.valueOf(new BigInteger(s1).Substract (new BigInteger(s2)));
    }
}