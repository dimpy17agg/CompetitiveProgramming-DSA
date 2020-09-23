class Tree
{
    ArrayList<Integer> l=new ArrayList<Integer>();
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
             post(root);
        return l;
        
    }
    void post(Node root){
        if(root!=null){
    post(root.left);    
        post(root.right);
        l.add(root.data);
    }
    }
}
