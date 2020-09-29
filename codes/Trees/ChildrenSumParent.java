class Tree
{
    // Return 1 if all the nodes in the tree satisfy the given property. Else return 0
    public static int isSumProperty(Node root)
    {
        // add your code here
    if(root==null)
    return 1;
  if(root.left==null && root.right==null)
    return 1;
    int sum=0;
    if(root.left!=null)
    sum=sum+root.left.data;
    if(root.right!=null)
    sum=sum+root.right.data;
        
      if(root.data!=sum)
       return 0;
       else
       return isSumProperty(root.left) & isSumProperty(root.right);
    }
}
