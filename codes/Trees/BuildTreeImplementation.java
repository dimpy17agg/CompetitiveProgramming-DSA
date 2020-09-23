import java.util.*;

public class BuildTree{
      //static  Node root=null;  
       //static Nodde tail=null;
        //static int p=0;
        static Node tailLeft=null;
        static Node tailRight=null;
     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        ArrayDeque<Node> dq=new ArrayDeque<Node>();
        int n=sc.nextInt();
         int[] ar=new int[n];
            int a=sc.nextInt();
          ar[0]=a; 
        
        for(int i=1;i<n;i++){
           a=sc.nextInt();
           ar[i]=a;
           //dq.addLast(a);
           //System.out.print(ar[i]+" ");
        }
      System.out.println();
        Node root=new Node(ar[0]);
        dq.addLast(root);
        for(int i=1;i<n;i++){
            Node curr=dq.peekFirst();
            dq.removeFirst();
           a=ar[i];
           Node tree=new Node(a);
           curr.left=tree;
            dq.addLast(tree);
            i++;
            if(i<n){
                a=ar[i];
               tree=new Node(a);
               curr.right=tree;
               dq.addLast(tree);
            }
            
        
        }
        print(root);
        
     }
     
    public static void print(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            print(root.left);
            print(root.right);
        }
    }
     
}

class Node{
    
    Node left;
    int data;
    Node right;
    
    Node(int d){
        data=d;
    }
    
}
