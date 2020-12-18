import java.util.*;

public class Solution{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        
    int k=sc.nextInt();
       System.out.println("maximum of all subarrays of size k");
        maxElementSubarray(ar,k);
     }
     
     public static void maxElementSubarray(int[] ar,int k){
      int n=ar.length;
      ArrayList<Integer> l=new ArrayList<Integer>();
      for(int i=0;i<k;i++){
          l.add(ar[i]);
      }
    //System.out.println(l);

        System.out.println(Collections.max(l));
        for(int i=k;i<n;i++){
          l.remove(0);
          l.add(ar[i]);
        System.out.println(Collections.max(l));
        }
        
     }
     
}
