   Node curr;
    
   int postIndex;
    Node buildTree(int in[], int post[], int n) {
        // Your code here
          postIndex=n-1;
          Node root=conTree(in,post,0,n-1);
     return root;
    }
    
    public Node conTree(int[] in,int[] post,int is,int ie){
        
       if(is>ie)
       return null;
       
       Node root=new Node(post[postIndex]);
       postIndex--;
       int inIndex=0;
       for(int i=is;i<=ie;i++){
           if(root.data==in[i])
           {
               inIndex=i;
               break;
           }
       }
       
       root.right=conTree(in,post,inIndex+1,ie);
       root.left=conTree(in,post,is,inIndex-1);
       return root;

    }
    
