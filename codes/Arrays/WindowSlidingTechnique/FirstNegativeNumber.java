import java.util.*;

public class Solution{

     public static void main(String []args){

          Scanner sc=new Scanner(System.in);
          
          int n=sc.nextInt();
              int[] ar=new int[n];
          for(int i=0;i<n;i++) 
           ar[i]=sc.nextInt();
           
           int k=sc.nextInt();
           System.out.println("first negative no. of window size of k");
           
           ArrayList<Integer> l=new ArrayList<Integer>();
           
           ArrayList<Integer> res=new ArrayList<Integer>();
           
           for(int i=0;i<k;i++)
           {
               if(ar[i]<0)
                   l.add(i);
           }           
           
           for(int i=k;i<n;i++){
               if(l.isEmpty()){
                   res.add(0);
               }
               else{
                   res.add(ar[l.get(0)]);
               }
               
               while(!l.isEmpty() && l.get(0)<i-k+1)
               l.remove(0);
               
               if(ar[i]<0)
               l.add(i);
               
           }
           if(!l.isEmpty())
           res.add(l.get(0));
           else
           res.add(0);
           
           
           System.out.println(res);
           
           
           
     }
}
