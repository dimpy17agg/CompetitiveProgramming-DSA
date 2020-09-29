public static Tree convert(Node head, Tree node) {
        // add code here.}
        if(head==null)
        return null;
   Tree root=new Tree(head.data);
   node=root;
      Queue<Tree> q=new LinkedList<Tree>();
      q.add(root);
      Node curr=head.next;
      while(curr!=null){
          root=q.poll();
          
         Tree tree=new Tree(curr.data);
         q.add(tree);
         root.left=tree;
         
         if(curr.next!=null){
             curr=curr.next;
             Tree rt=new Tree(curr.data);
             q.add(rt);
             root.right=rt;
         }
         curr=curr.next;
      }
      return node;
      
    }
