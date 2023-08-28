class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	
	Node curr=head;
	
// 	We have to travers the node from starting to endo 
//  In Middle of that we have to perform the opertaiong to remove the duplicates
	
	while(curr != null && curr.next != null){
	    if(curr.data==curr.next.data) 
	    curr.next=curr.next.next;
	    else 
	    curr=curr.next;
	}
	return head;
    }
}