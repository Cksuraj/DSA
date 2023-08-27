class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        
        // string lenght n
        int n=str.length();
        
        // StringBuilder to perform operations on string 

        StringBuilder ans= new StringBuilder();
        
        for(int i=0;i<n;i++){
        // appending the into stringBuilder
            ans.append(str.charAt(n-1-i));
        }
        
        return ans.toString();
        
    }
}