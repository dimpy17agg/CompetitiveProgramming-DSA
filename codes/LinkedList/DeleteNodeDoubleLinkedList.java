
/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class GfG
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here	
    
        if(x==1){
        Node curr=head;
        curr=curr.next;
        curr.prev=null;
        head=curr;
        return head;
        }
        
        int y=1;
        Node prev=null;
        Node curr=head;
        while(y<x && curr!=null){
            prev=curr;
            curr=curr.next;
            y++;
        }
        if(curr.next==null)  
        prev.next=null;
        else{
            prev.next=curr.next;
            curr=curr.next;
            curr.prev=prev;
        }
        return head;
    
    }
}
