/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/


    public static int getCount(Node head)
    {
        
        //Code here
        
        Node curr=head;
        int l=0;
        while(curr!=null){
            
            l++;
            curr=curr.next;
        }
        
        return l;
    }
