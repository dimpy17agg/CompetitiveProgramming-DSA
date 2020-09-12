// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
    
        Node curr=head;
        
        int c0=0;
        int c1=0;
        int c2=0;
        while(curr!=null){
            if(curr.data==0)
            c0++;
            if(curr.data==1)
            c1++;
            if(curr.data==2)
            c2++;
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            if(c0!=0){
                curr.data=0;
                c0--;
            }
            else if(c1!=0){
                curr.data=1;
                c1--;
            } 
            else{
                curr.data=2;
                c2--;
            }
            curr=curr.next;
        }
        return head;
    }
}


