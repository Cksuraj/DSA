
class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        // code here
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<N; i++) {
            int rowSum = 0;
            int colSum = 0;
            for(int j=0; j<N; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            ans.add(rowSum);
            ans.add(colSum);
        }
        
        int temp = 0;
        int max = Collections.max(ans);
        for(int num : ans) {
            temp = temp +  (max - num);
        }
        return temp / 2;
    }
}
        