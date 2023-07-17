class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        
        StringBuilder ans= new StringBuilder();
        int arr[]=new int[26];
        int n=A.length();
        // here we are storing the each character int str 
    
        Queue<Character> str = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            // adding  the ASCII values of A 
            char ch=A.charAt(i);
            arr[ch-'a']++;
            str.add(ch);
            
            // checking the frequency of Queue 

            while(!str.isEmpty()){
                if(arr[str.peek()-'a']==1){
                    ans.append(str.peek());
                    break;
                }                
                else
                str.poll();
            }
            if(str.isEmpty())
                ans.append('#');
        }
        return ans.toString();
    }
}