//{ Driver Code Starts
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.io.IOException;
    import java.util.Arrays;
    import java.util.*;
    
    
    public class Driver {
        
        public static void main(String[] args)throws IOException {
           
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine());
            while(tc-->0)
            {
                String s1 = br.readLine();
                String s2 = br.readLine();
                
                Solution obj = new Solution();
                
                boolean a = obj.areIsomorphic(s1,s2);
                if(a)
                System.out.println(1);
                else
                System.out.println(0);
            }
        }
        
    }
    
    // } Driver Code Ends
    
    
    class Solution
    {
        //Function to check if two strings are isomorphic.
        public static boolean areIsomorphic(String str1,String str2)
        {
            
            if(str1.length()!=str2.length()) return false;  // after understanding question 
            
            int n=str1.length();                             
            
            HashMap<Character , Character> map =new HashMap<>();   // map to map the strcharacter
            
            int arr[]=new int[26];                                 // we know the range of char a to z
            
            for(int i=0;i<n;i++){
                char a=str1.charAt(i);
                char b=str2.charAt(i);
                                                         
                if(map.containsKey(a)){                            // checking if the map contains key 
                    if(!map.get(a).equals(b)) return false;
                }
                else{
                    if(arr[b-'a']==1) return false;
                    arr[b-'a']=1;                                   // insureing the relation of character
                    map.put(a,b);
                }
            }
            return true;
        }
    }