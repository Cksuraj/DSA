class solution {

    public void  transpose(int n, int arr[][]){
        // easy porbleam 
        // Just running two for loop and swapping row with col

        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){

                // swaping opration 
                int temp =arr[i][j]; arr[i][j]=arr[j][i]; arr[j][i]=temp;
            }
        }
    }
}