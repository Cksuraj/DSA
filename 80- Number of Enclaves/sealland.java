class Solution {
    int numberOfEnclaves(int[][] a) {
       int n = a.length; int m= a[0].length;
        for(int i = 0;i < n;i++){
		    if(a[i][0] == 1) //1st col
			    dfs(a, i, 0,  n, m);

			 if(a[i][m-1] == 1) //last col
			    dfs(a, i, m-1, n, m);
		}
		for(int i = 0;i < m;i++){
			if(a[0][i] == 1) //1st row
			    dfs(a, 0, i,  n, m);
			 if(a[n-1][i] == 1)  	// last row
			    dfs(a, n-1, i,  n, m);
		}

			 int cnt =0;
		for(int i = 0;i < n;i++)
			for(int j = 0;j < m;j++)
				cnt+=a[i][j];

		return cnt;
    }
     static void dfs(int a[][], int x, int y, 
                        int N, int M)
    {
        // out of bound
        if (x < 0 || x >= N || y < 0 || y >= M)
            return;
        if(a[x][y]==0)
        return;
        // mark with newC and itr in 4 neighbours
        a[x][y] = 0;
        dfs(a, x+1, y,  N, M);
        dfs(a, x-1, y,  N, M);
        dfs(a, x, y+1,  N, M);
        dfs(a, x, y-1,  N, M);
    }
}
