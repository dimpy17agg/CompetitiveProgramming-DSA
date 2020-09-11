// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

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

class LinkedList
{
    static  Node head;  
    static  Node lastNode;
    
    public static void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n, K;
            n = sc.nextInt();
            K = sc.nextInt();
            
            Node head = null;
            int val = sc.nextInt();
            head = new Node(val);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                val = sc.nextInt();
                addToTheLast(new Node(val));
            }
            
            Node before[] = new Node[n];
            addressstore(before, head);
            GFG obj = new GFG();
            
            head = obj.swapkthnode(head, n, K);
        
           Node after[] = new Node[n];
          addressstore(after, head);
        
        if(check(before, after, n, K) == true)
            System.out.println("1");
        else
            System.out.println("0");
        
        }
    }
    
    static boolean check(Node before[], Node after[], int num, int K)
    {
          if(K > num)
           return true;
           
           return (before[K-1] == after[num - K]) && (before[num-K] == after[K-1]);
              
       
    }
    
    static void addressstore(Node arr[], Node head)
  {
      Node temp = head;
      int i = 0;
      while(temp != null){
        arr[i] = temp;
        i++;
        temp = temp.next;
    }
}
    
}// } Driver Code Ends


//User function Template for Java


/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class GFG
{
    // Should swap Kth node from beginning and 
    // Kth node from end in list and return new head.
    Node swapkthnode(Node head, int num, int K)
    {
        // your code here
        if(head==null)
        return head;
        if(K==0)
        return head;
        if(num<K)
        return null;
        if(num%2!=0 && (num+1)%2==K)
        return head;
        Node ptr1=head;
        Node ptr2=head;
        Node prev1=null;
        Node prev2=null;
        Node curr=head;
        int x=1;
        while(x<K && curr!=null){
            prev1=curr;
            ptr1=curr.next;
            curr=curr.next;
           x++;
        }
        curr=head;
        x=1;
        int y=num-K;
        while(x<=y && curr!=null){
            prev2=curr;
            ptr2=curr.next;
            curr=curr.next;
           x++; 
        }
        /*
        if(prev1==null){
            Node temp=ptr2;
            prev2.next=ptr1;
            ptr2.next=ptr1.next;
            ptr1.next=null;
            head=ptr2;
        }
        else if(prev2==null){
            Node temp=ptr2.next;
            prev1.next=ptr2;
            ptr1.next=temp;
            ptr2.next=null;
            head=ptr1;
        }
        else{
        Node temp=ptr1.next;
        prev1.next=ptr2;
        prev2.next=ptr1;
        ptr1.next=ptr2.next;
        ptr2.next=temp;
        }
     curr=head;
     */
     
      if (prev1 != null) 
            prev1.next = ptr2; 
  
        if (prev2 != null) 
            prev2.next = ptr1; 
 
        Node temp = ptr1.next; 
        ptr1.next = ptr2.next; 
        ptr2.next = temp; 
  
        if (K == 1) 
            head = ptr2; 
  
        if (K == num) 
            head = ptr1; 
     
     
  /*   while(curr!=null){
      System.out.print(curr.data+" "); 
      curr=curr.next;
     }*/
    return head;
}
}
