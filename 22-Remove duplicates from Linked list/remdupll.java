
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        //  Hashset Datastrucutre is usefull to find and remove duplicates 
        
        HashSet<Integer>set=new HashSet<>();
        //  pointing to headnode (starting)
         Node curr=head;
         // null initialy
         Node prev=null;
         
        //  while loop until curr null
        
         while(curr!=null){
             int val=curr.data;
            //  if teh set conten curr val then skip curr
             if(set.contains(val)){
                 prev.next=curr.next;
             }
             // otherwise add the curr val
             
             else{
                 set.add(val);
                 prev=curr;
             }
             
             curr=curr.next;
         }
         
         return head;
    }
}
