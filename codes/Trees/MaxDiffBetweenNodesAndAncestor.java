class Tree
{
    int max=Integer.MIN_VALUE;
    int maxDiff(Node root)
    {
        //your code here
        findMax(root);
        return max;
    }
    int findMax(Node root){
        
        if(root==null)
         return Integer.MAX_VALUE;
        
        if(root.left==null && root.right==null)
        return root.data;
        
        int val=Math.min(findMax(root.left),findMax(root.right));
        
        max=Math.max(max,root.data-val);
        return Math.min(val,root.data);
    }
    
    
}

