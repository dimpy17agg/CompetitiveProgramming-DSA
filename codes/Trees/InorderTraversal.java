 ArrayList<Integer> l=new ArrayList<Integer>();
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        // Code
      //  ArrayList<Integer> a=new ArrayList<Integer>();
        inorderT(root);
        return l;
        
    }
    void inorderT(Node root){
        if(root!=null){
            inorderT(root.left);
            l.add(root.data);
            inorderT(root.right);
        }
    } 
    
