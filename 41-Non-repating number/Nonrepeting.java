class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Using HashMap
        
        ArrayList<Integer> l1 = new ArrayList<>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                
            map.put(i,1);
            }
        }
        
        // Iterating Over the Keys 
        
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                l1.add(key);
            }
        }
        
        int Nonrepeting[] = new int[l1.size()];
        
        for (int i = 0; i < l1.size(); i++) {
            Nonrepeting[i] = l1.get(i);
        }
        
        Arrays.sort(Nonrepeting);
        
        return Nonrepeting;
    }
}