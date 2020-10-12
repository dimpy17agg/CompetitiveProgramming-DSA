public class Tree
{
    void mirror(Node node)
    {
	// Your code here
	
	if(node==null)
	return;
	if(node.left==null && node.right==null)
	return;
	 
	Queue<Node> q=new LinkedList<Node>();
         Deque<Node> dq=new ArrayDeque<Node>();
         Node root=new Node(node.data);
        dq.add(node);
        q.add(root);
        while(!dq.isEmpty()){
            Node curr=dq.peek();
            ArrayList<Integer>l=new ArrayList<Integer>();
           int count=dq.size();
           for(int i=0;i<count;i++){
            curr=dq.remove();
             if(curr.left!=null){
             dq.add(curr.left);
             l.add(curr.left.data);
             }
             if(curr.right!=null){
           dq.add(curr.right);
           l.add(curr.right.data);
             }
           }
           //---linked list of children to reverse them-----//
            if(!l.isEmpty()){
            Collections.reverse(l);  
      //      System.out.println(l);
          for(int i=0;i<l.size();){
              Node c=q.remove();
             Node temp=new Node(l.get(i));
           i++;
           c.left=temp;
    //       System.out.println(c.left.data);
           q.add(temp);
           if(i<l.size()){
           temp=new Node(l.get(i));
           i++;
           c.right=temp;
           q.add(temp);
           }
          }
        }
        }
        swap(root,node);
        
    }
    /*
    void print(Node root){
        if(root==null)
        return;
        print(root.left);
        System.out.print(root.data+"  ");
        print(root.right);
        
    }
    */
    void swap(Node root,Node node){
        node.left=root.left;
        node.right=root.right;
    }
    
}
