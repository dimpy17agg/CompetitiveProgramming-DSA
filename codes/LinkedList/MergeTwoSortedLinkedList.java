// { Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


class MergeLists
{
    Node head;



  /* Function to print linked list */
   public static void printList(Node head)
    {
        
        while (head!= null)
        {
           System.out.print(head.data+" ");
           head = head.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Node head1 = new Node(sc.nextInt());
            Node tail1 = head1;
            for(int i=0; i<n1-1; i++)
            {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }
			Node head2 = new Node(sc.nextInt());
            Node tail2 = head2;
            for(int i=0; i<n2-1; i++)
            {
                tail2.next = new Node(sc.nextInt());
                tail2 = tail2.next;
            }
			
			LinkedList obj = new LinkedList();
			Node head = obj.sortedMerge(head1,head2);
			printList(head);
			
			t--;
			
         }
    }
}
// } Driver Code Ends


/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
      Node curr=null;
     Node head=null;
      int a=0,b=0;
      while(headA!=null && headB!=null){
          int x=headA.data;
          int y=headB.data;
          if(x<y){
              if(head==null){
                  curr=new Node(x);
                  head=curr;
              }
              else{
                  Node temp=new Node(x);
                  curr.next=temp;
                  curr=curr.next;
              }
              headA=headA.next;
          }
          else{
               if(head==null){
                  curr=new Node(y);
                  head=curr;
              }
              else{
                  Node temp=new Node(y);
                  curr.next=temp;
                  curr=curr.next;
              }
              headB=headB.next;
          }
      }
      while(headA!=null){
          int x=headA.data;
          if(head==null){
                  curr=new Node(x);
                  head=curr;
              }
              else{
                  Node temp=new Node(x);
                  curr.next=temp;
                  curr=curr.next;
              }
              headA=headA.next;
      }
      while(headB!=null){
          int y=headB.data;
          if(head==null){
                  curr=new Node(y);
                  head=curr;
              }
              else{
                  Node temp=new Node(y);
                  curr.next=temp;
                  curr=curr.next;
              }
              headB=headB.next;         
      }
      
    return head;
   } 
   
}
