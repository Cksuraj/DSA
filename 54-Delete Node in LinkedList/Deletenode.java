/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
      head=rev(head);
      
       Node curr=head;
       
// as Per the given condtion just need to compare and remove the lesser node form LL

       while(curr!=null && curr.next!=null){
           if(curr.data>curr.next.data) curr.next=curr.next.next;
           else curr=curr.next;
       }
       
       return rev(head);
    }
    
//   Logic for reversing the Node 

    Node rev(Node head){
        Node prev=null,next=null;
        
        while(head!=null){
            next=head.next;
            head.next= prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
  