
// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
    // Hi Suraj your going to create new history of human erra
    
    int ans=0;;
    int i=0;
    int j=0;

// Base Case 
if(k>s.length()) return -1;

//let's Create Hashmap to store the pair of duplicate character 

HashMap<Character, Integer> map=new HashMap<>();

while(j<s.length()){
    
    char ch=s.charAt(j);
    map.put(ch,map.getOrDefault(ch,0)+1);
    if(map.size()==k) ans=Math.max(ans,j-i+1);
    
    while(map.size()>k){
        char x=s.charAt(i);
        map.put(x,map.get(x)-1);
        if(map.get(x)==0){
            map.remove(x);
        }
        i++;
    }
    j++;
}

return ans;
    }
}