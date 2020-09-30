Node lca(Node root, int n1,int n2)
	{
		// Your code here
	if(root==null)
	return root;
	    ArrayList<Node> p1=new ArrayList<Node>();
	    ArrayList<Node> p2=new ArrayList<Node>();
	    
	    if(findPath(root,n1,p1)==false || findPath(root,n2,p2)==false)
	    {
	        return null;
	    }
	    Node curr=null;
	    for(int i=0;i<p1.size() && i<p2.size();i++){
	        if(p1.get(i).data==p2.get(i).data)
	        curr=p1.get(i);
	    }
	    return curr;
	}
	
    boolean findPath(Node root,int n,ArrayList<Node> p){
        
        if(root==null)
        return false;
        p.add(root);
        if(root.data==n)
        return true;
        
    if(findPath(root.left,n,p)|| findPath(root.right,n,p))
        return true;
        p.remove(p.size()-1);
        return false;
        
    }
}
