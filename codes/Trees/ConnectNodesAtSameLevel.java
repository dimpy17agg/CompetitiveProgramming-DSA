  /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    public static void connect(Node p)
        {
            // code here.
            Queue<Node> q=new LinkedList<Node>();
            Node curr=p;
            
            q.add(curr);
            while(!q.isEmpty()){
              int s=q.size();
             //   curr=q.poll();
             Node prev=null;
                for(int i=0;i<s;i++){
                    curr=q.peek();
                    if(prev==null)
                    prev=curr;
                    else{
                    prev.nextRight=curr;
                    prev=curr;
                    }
                    if(curr.left!=null)
                    q.add(curr.left);
                    if(curr.right!=null)
                    q.add(curr.right);
                    q.poll();
            }
            }
            
            
        }
