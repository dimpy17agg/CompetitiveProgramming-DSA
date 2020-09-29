class Spiral
{
      ArrayList<Integer> findSpiral(Node node) 
      {
          // Your code here
           Queue<Node> q=new LinkedList<Node>();
           ArrayList<Integer> l=new ArrayList<Integer>();
           Stack<Integer> st=new Stack<Integer>();
           boolean reverse=true;
          q.add(node);
          while(!q.isEmpty()){
              
              int count=q.size();
              for(int i=0;i<count;i++){
                  Node curr=q.poll();
                  if(reverse){
                      if(curr!=null)
                      st.push(curr.data);
                  }
                  else{
                      l.add(curr.data);
                  }
                  if(curr!=null){
                  if(curr.left!=null)
                  q.add(curr.left);
                  if(curr.right!=null)
                  q.add(curr.right);
              }
              }
            if(reverse){
                while(!st.isEmpty())
                l.add(st.pop());
            }
              reverse=!reverse;
          }
           
        return l;

      }
}
