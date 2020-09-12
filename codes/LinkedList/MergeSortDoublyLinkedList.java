// { Driver Code Starts


import java.util.*;
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next, prev;
    Node(int key)
    {
        data = key;
        next = prev = null;
    }
}

class Driverclass
{
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int a1 = sc.nextInt();
	        Node head = new Node(a1);
	        Node temp = head;
	        
	        for (int i = 1;i < n;i++)
	        {
	            int a = sc.nextInt();
	            Node n1 = new Node(a);
	            n1.prev = temp;
	            temp.next = n1;
	            temp = n1;
	        }
	        
	        head = new LinkedList().sortDoubly(head);
	        printList(head);
	    }
	}
	public static void printList(Node node)
	{
	    Node temp = node;
	    while(node != null)
	    {
	        System.out.print(node.data + " ");
	        temp = node;
	        node = node.next;
	    }
	    System.out.println();
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.prev;
	    }
	    System.out.println();
	}
}
// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class LinkedList
{
    static Node sortDoubly(Node head)
    {
        // add your code here
        if(head==null || head.next==null)
        return head;
        
        Node mid=getMid(head);
        Node midNext=mid.next;
        mid.next=null;
        midNext.prev=null;
        Node left=sortDoubly(head);
        Node right=sortDoubly(midNext);
        
        Node ms=merge(left,right);
        return ms;
        
    }
    
    static Node getMid(Node head){
      Node slow=head;
      Node fast=head;
      
      while(fast.next!=null && fast.next.next!=null)
      {
       slow=slow.next;
       fast=fast.next.next;
       
      }
      return slow;
    }
    
    static Node merge(Node a,Node b){
        Node h=null;
        Node t=null;
        if(a==null)
        return b;
        if(b==null)
        return a;
        
        while(a!=null && b!=null){
            if(a.data<=b.data){
                if(h==null){
                    Node temp=new Node(a.data);
                    h=temp;
                    t=temp;
                }
                else{
                    Node temp=new Node(a.data);
                    t.next=temp;
                    temp.prev=t;
                    t=temp;
                }
                a=a.next;
            }
            else{
                 if(h==null){
                    Node temp=new Node(b.data);
                    h=temp;
                    t=temp;
                }
                else{
                    Node temp=new Node(b.data);
                    t.next=temp;
                    temp.prev=t;
                    t=temp;
                }
                b=b.next;
            }
        
        }
        
        while(a!=null){
             Node temp=new Node(a.data);
                    t.next=temp;
                    temp.prev=t;
                    t=temp;
                a=a.next;
        }
        
        while(b!=null){
             Node temp=new Node(b.data);
                    t.next=temp;
                    temp.prev=t;
                    t=temp;
                
                b=b.next;
        }
        return h;
    }
    
    
    
}
