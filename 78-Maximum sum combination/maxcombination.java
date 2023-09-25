class Solution {
    
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        
        PriorityQueue<Integer> q=new PriorityQueue<>();
        List<Integer> list=new ArrayList<>();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=N-1;i>N-K-1;i--){
            for(int j=N-1;j>N-K-1;j--){
            int sum= A[i]+B[j];
            if(q.size() < K) q.add(sum);
                else{
                    if(q.peek()<sum){
                        q.remove();
                        q.add(sum);
                    }
                    else break;
                }
            }
        }
        while(q.size()>0){
        list.add(0,q.poll());
    }
    return list;
}
}