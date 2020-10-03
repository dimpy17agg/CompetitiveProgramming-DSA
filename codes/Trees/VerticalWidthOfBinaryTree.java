class Tree
{
 int max=0,min=0;
    public static int verticalWidth(Node root)
	{
	    // code here.
	    if(root==null)
	    return 0;
	    	   Tree t=new Tree();

	   t.getWidth(root,0);
	   return (t.max+Math.abs(t.min)+1);
	}
	
	public void getWidth(Node root,int w){
	  if(root==null)
	  return;
	  
	  getWidth(root.left,w-1);
  //  System.out.println(root.data+" "+w);
        if(max<w)
            max=w;
        if(min>w)
            min=w;
    
         getWidth(root.right,w+1);
//	    System.out.println(root.right+" "+w);
	}
	
	
	
}
