class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // Add code here
        
    //   decalring the 3 size of array 
    
        int arr[]=new int[3];
        
        for(Node curr=head; curr!=null; curr=curr.next){
            if(curr.data==0) arr[0]++;
            else if(curr.data==1) arr[1]++;
            else arr[2]++;
        }
        
        Node curr=head;
        int indx=0;
        
        while(curr!=null){
            if(arr[indx]==0)
                indx++;
            
            if(arr[indx]!=0){
                curr.data=indx;
                arr[indx]--;
                curr=curr.next;
            }
            
        }
        return head;
        
    }
}
