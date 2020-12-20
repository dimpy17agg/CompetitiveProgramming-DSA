import java.util.*;

public class Solution{

     public static void main(String []args){

     Scanner sc=new Scanner(System.in);
     
     String s=sc.next();

     String p=sc.next();
     
     System.out.println(findPermutation(s,p));
}


public static String findPermutation(String s,String p){
    int n=s.length();
   int k=p.length();
   if(k>n)
   return "not possible";
   ArrayList<Integer> l=new ArrayList<Integer>();
   int[] ct=new int[26];
         int[] pt=new int[26];
         for(int i=0;i<k;i++){
           pt[(int)(p.charAt(i)-'a')]++;
             ct[(int)(s.charAt(i)-'a')]++;
         }
         int start=0;
         if(checkEqual(ct,pt))
         l.add(0);
         
         for(int i=k;i<n;i++){
            ct[(int)(s.charAt(i-k)-'a')]--;
            ct[(int)(s.charAt(i)-'a')]++;
            if(checkEqual(ct,pt))
            l.add(i-k+1);
         }
         
         System.out.println(l);
         return "indexes of string";
     }
     
     public static boolean checkEqual(int[] ct,int[] pt){
         String c=Arrays.toString(ct);
         String p=Arrays.toString(pt);
         if(c.equals(p))
         return true;
         return false;
     }
     
     
}
