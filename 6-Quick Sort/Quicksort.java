class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        
        //  low to high checking 
        
         if(low < high){
        int p = partition(arr , low , high);
        quickSort(arr, low , p-1);
        quickSort(arr, p+1 , high);
        }
    }
    
     static void swap(int i , int j){
        int t;
        t = i;
        i = j;
        j = t;
    }
    
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;
        int t;
        for(int j=low;j<=high-1;j++){
            if(arr[j] < pivot){
                i++;
                t = arr[i];
                arr[i] = arr[j];
                
                arr[j] = t;
            }
        }
                t = arr[i+1];
                arr[i+1] = arr[high];
                
                arr[high] = t;
        return i+1;
    } 
}
