import java.util.ArrayList;

class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
       
        int first=-1, last =-1;

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                if(first==-1)
                first=i;

                last=i;
            }
        }

     ArrayList<Integer>list=new ArrayList<>();
     list.add(first); 
     list.add(last);

     return list; 
    }
}
