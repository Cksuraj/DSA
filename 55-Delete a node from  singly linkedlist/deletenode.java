/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Deleteing the Node from the singly linked list
	
// 	 if our x is at starting of the node then simply returning that 

	if(x==1) return head.next;
     
     Node curr=head;
   
     while(curr.next!=null){
         if(x==2){ 
         curr.next=curr.next.next;
         break;
         }
         else
         curr=curr.next;
         x--;
     }	
	 return head;
	 
    }
}