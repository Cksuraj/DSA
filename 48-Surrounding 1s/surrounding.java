class Solution
{
    static int cnt(int i, int j, int n, int m, int[][] matrix){
        int zero = 0;
        
        // left direction of the matrix
        if(i-1 >= 0 && matrix[i-1][j] == 0) zero++;
        
        // right direction of the matrix
        if(i+1 < n && matrix[i+1][j] == 0) zero++;
        
        // up direction of the matrix
        if(j-1 >= 0 && matrix[i][j-1] == 0) zero++;
        
        // down direction of the matrix
        if(j+1 < m && matrix[i][j+1] == 0) zero++;
        
        // diagonal directions of the matrix
        if(i-1 >= 0 && j+1 < m && matrix[i-1][j+1] == 0) zero++; 
        if(i+1 < n && j-1 >= 0 && matrix[i+1][j-1] == 0) zero++; 
        if(i-1 >= 0 && j-1 >= 0 && matrix[i-1][j-1] == 0) zero++; 
        if(i+1 < n && j+1 < m && matrix[i+1][j+1] == 0) zero++;

        return zero;
    }
    
    public int Count(int[][] matrix)
    {
        int ans = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 1){
                    int total = cnt(i, j, n, m, matrix);
                    if(total != 0 && total % 2 == 0){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
