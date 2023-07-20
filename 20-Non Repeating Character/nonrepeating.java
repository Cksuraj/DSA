
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        HashMap<Character,Integer>map =new HashMap<>();
      
        // adding into map key value pair

        for(int i=0;i<S.length();i++){
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);    
        }
        
        // if we got 1 value that is our ans 
            for(int i=0;i<S.length();i++)
            if(map.get(S.charAt(i))==1)
            return S.charAt(i);
            
            return '$';
        
    }
}

