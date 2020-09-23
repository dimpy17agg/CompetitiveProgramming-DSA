static ArrayList<Integer> preorder(Node root)
    {
        // Code here
         ArrayList<Integer> a=new ArrayList<Integer>();
          pre(root);
          for(int i=0;i<l.size();i++){
              a.add(l.get(i));
          }
          l.clear();
        return a;
    }

       static void pre(Node root){
           if(root!=null){
           l.add(root.data);
           pre(root.left);
           pre(root.right);
           }   
       }
