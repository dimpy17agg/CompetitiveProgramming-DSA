// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    static Node addLists(Node first, Node second){
        // code here
        // return head of sum list
        Node h=null;
        Node t=null;
        Node f=rev(first);
        Node s=rev(second);
        int c=0;
        while(f!=null && s!=null){
        
            int x=f.data;
            int y=s.data;
            int r=(x+y+c)%10;
            Node temp=new Node(r);
            if(h==null){
                h=temp;
                t=temp;
            }else{
                t.next=temp;
                t=temp;
            }
              if((x+y+c)>=10){
                c=1;
            }else{
                c=0;
            }
            f=f.next;
            s=s.next;
        }
        while(f!=null){
        int x=f.data;
        x=x+c;
        int r=(x)%10;
            Node temp=new Node(r);
            if(h==null){
                h=temp;
                t=temp;
            }else{
                t.next=temp;
                t=temp;
            }
              if(x>=10){
                c=1;
            }else{
                c=0;
            }
            f=f.next;
        
        }
        while(s!=null){
        int x=s.data;
        x=x+c;
        int r=(x)%10;
            Node temp=new Node(r);
            if(h==null){
                h=temp;
                t=temp;
            }else{
                t.next=temp;
                t=temp;
            }
              if(x>=10){
                c=1;
            }else{
                c=0;
            }
            s=s.next;
        }
        if(f==null && s==null && c==1){
            Node temp=new Node(1);
            t.next=temp;
        }
        
        h=rev(h);
        return h;
    }
    
    static Node rev(Node head){
        
        Node curr=head;
        
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    
}
