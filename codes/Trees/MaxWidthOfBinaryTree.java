class Tree
{
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root)
    {
        // Your code here
        int max=0;
        
        if(root==null)
        return 0;
        
        Queue<Node> q=new LinkedList<Node>();
        
        q.add(root);
        while(!q.isEmpty()){
            int c=q.size();
            max=Math.max(c,max);
            for(int i=0;i<c;i++){
                 Node curr=q.poll();
                 if(curr.left!=null)
                 q.add(curr.left);
                 if(curr.right!=null)
                 q.add(curr.right);
            }
        }
         return max;
    }		
}
