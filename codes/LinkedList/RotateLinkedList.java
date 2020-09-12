// { Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Rotate g = new Rotate();
            head = g.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends



/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    
    public Node rotate(Node head, int k) {
        // add code here
     Node prev=null;
     Node curr=head;
     int i=0;
     while(i<k && curr!=null){
         if(curr==null)
         return head;
         prev=curr;
         curr=curr.next;
         i++;
     }
     
        if(curr==null){
            return head;
        }
        
        Node temp=head;
        Node h=curr;
        while(curr.next!=null)
        curr=curr.next;
        
        prev.next=null;
        while(head!=null){
            curr.next=head;
            head=head.next;
            curr=curr.next;
        }
        return h;
    }
}
