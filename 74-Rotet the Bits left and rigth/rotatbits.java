class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        
    ArrayList<Integer> item =  new ArrayList<>();
        
        int m = D%16;
        
        int l = (N<<m|N>>(16-m))&65535;
        
        int r = (N>>m|N<<(16-m))&65535;
        
        item.add(l);
        item.add(r);
        
        return item;
    }
}