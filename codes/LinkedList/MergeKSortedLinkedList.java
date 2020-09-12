// { Driver Code Starts
import java.util.*;

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


class GfG
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            
            Merge g = new Merge();
             
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Merge
{
    Node mergeKList(Node[]a,int N)
    {
        //Add your code here.
        if(a.length==0)
        return null;
        Node h=null;
        for(int i=0;i<a.length;i++){
            
            Node h1=a[i];
            h=merge(h1,h);
         //   System.out.println("merging after linkedlists "+ i+1);
           // Node curr=h;
         
        }
        return h;
    }
    Node merge(Node a,Node b){
        
        if(a==null)
        return b;
        if(b==null)
        return a;
        
        Node h=null;
        Node t=null;
        while(a!=null && b!=null){
            if(a.data<=b.data){
             
             if(h==null){
                 Node temp=new Node(a.data);
                 h=temp;
                 t=temp;
             }else{
                 Node temp=new Node(a.data);
                 t.next=temp;
                 t=temp;
             }
                 a=a.next;
            }
            else{
             if(h==null){
                 Node temp=new Node(b.data);
                 h=temp;
                 t=temp;
             }else{
                 Node temp=new Node(b.data);
                 t.next=temp;
                 t=temp;
             }
                 b=b.next; 
            }
            
        }
        if(a!=null){
            t.next=a;
        }
        if(b!=null){
            t.next=b;
        }
        return h;
    }
    
}
