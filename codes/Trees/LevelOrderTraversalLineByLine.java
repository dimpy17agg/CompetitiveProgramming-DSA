
/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Level_Order_Traverse
{
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        // Your code here
    
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        
        Queue<Node> q=new LinkedList<Node>();
        
        q.add(node);
        q.add(null);
        //int s=2;
    ArrayList<Integer> l=new ArrayList<Integer>();
        while(q.size()>1){
            Node curr=q.peek();
            q.poll();
            //s--;
            if(curr==null){
          // System.out.println("l--->  "+l);
               al.add(l);
         //System.out.println("al--> "+al);
             l=new ArrayList<Integer>();
               q.add(null);
          //     s++;
            continue;
            }
          l.add(curr.data);          
            if(curr.left!=null){
            q.add(curr.left);
            //s++;
            }
            if(curr.right!=null){
            q.add(curr.right);
            //s++;
            }
       
        }
        al.add(l);
        return al;
    }
}
