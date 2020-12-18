import java.util.*;

public class Solution{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        //string
        String str=sc.next();
        //anagram
        String ptr=sc.next();
        
        
       System.out.println("count occurrences of all anagram in  string");
        
        
        int count=countAnagram(str,ptr);
        System.out.println(count);
     }
     
     public static int countAnagram(String str,String ptr){
        
         int count=0;
         int n=str.length();
         int k=ptr.length();
          if(k>n)
         return 0;
         int[] ct=new int[26];
         int[] pt=new int[26];
         for(int i=0;i<k;i++){
           pt[(int)(ptr.charAt(i)-'a')]++;
             ct[(int)(str.charAt(i)-'a')]++;
         }
         
         if(checkEqual(ct,pt)){
         count++;
         }
         
         for(int i=k;i<n;i++){
            ct[(int)(str.charAt(i-k)-'a')]--;
            ct[(int)(str.charAt(i)-'a')]++;
            if(checkEqual(ct,pt)){
            count++;
         }
         return count;
     }
     
     public static boolean checkEqual(int[] ct,int[] pt){
         String c=Arrays.toString(ct);
         String p=Arrays.toString(pt);
         if(c.equals(p))
         return true;
         return false;
     }
     
}
