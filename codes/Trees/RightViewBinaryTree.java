class Tree{
    ArrayList<Integer> rightView(Node node) {
        //add code here.
    ArrayList<Integer> l=new ArrayList<Integer>();
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()){
          int c=q.size();
          for(int i=0;i<c;i++){
              Node curr=q.poll();
              if(i==c-1 && curr!=null)
              l.add(curr.data);
              if(curr!=null && curr.left!=null)
              q.add(curr.left);
              if(curr!=null && curr.right!=null )
              q.add(curr.right);
          }    
        }
       return l; 
        
        
    }
}
