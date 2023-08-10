class Pair{  //pair to store distance,i and j of the matrix
    int first,second,third;
    Pair(int dis,int a,int b){
        first=dis;
        second=a;
        third=b;
    }
}

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        //BFS traversal of A using Queue
        Queue<Pair> q=new LinkedList<>();
         //we start from first position where dis=0,i=0 and j=0
        q.add(new Pair(0,0,0));
        
        int ti[]={0,-1,1,0};
        int tj[]={1,0,0,-1};    
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int dis=temp.first,i=temp.second,j=temp.third;
             //if we find x and y we return the disif(i==X && j==Y) return dis;
            for(int k=0;k<4;k++){
                int newi=i+ti[k],newj=j+tj[k]; 
                if(newi>=0 && newj>=0 && newi<N && newj<M && A[newi][newj]==1){ 
                    //here we are checking so that the positions don't go out of bounds 
                    //and the next position we are checking is 1
            
                    A[newi][newj]=0;    
                    q.add(new Pair(dis+1,newi,newj));
                    
                }
            }
        }
        return -1;
    }
};