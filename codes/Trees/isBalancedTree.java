class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
	// Your code here
	    if(isBal(root)==-1)
	    return false;
	    
	    return true;
	
    }
    
    int isBal(Node root){
      
         if(root==null)
         return 0;
         
        int lh=isBal(root.left);
        if(lh==-1)
        return -1;
        
        int rh=isBal(root.right);
        if(rh==-1)
        return -1;
        
        if(Math.abs(lh-rh)>1)
        return -1;
        
        return Math.max(lh,rh)+1;
          
    }
    
    
    
}

