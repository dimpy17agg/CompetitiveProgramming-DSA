import java.util.*;

public class Solution{

     public static void main(String []args){

     Scanner sc=new Scanner(System.in);
     
     String s=sc.next();

     int k=sc.nextInt();
     
     System.out.println(findLongest(s,k));
    

}


public static String findLongest(String s,int k){
    int n=s.length();
    int[] count=new int[26];
    int u=0;
    for(int i=0;i<n;i++){
        if(count[s.charAt(i)-'a']==0)
        u++;
        count[s.charAt(i)-'a']++;
    }
    if(k>u || k>n)
    return "falsestring values";
    
    int start=0;
    int end=0;
    int max_start=0;
    int max_window=1;
    Arrays.fill(count,0);
    count[s.charAt(0)-'a']++;
    for(int i=1;i<n;i++){
        count[s.charAt(i)-'a']++;   
        end++;
        
        while(!isCount(count,k)){
            count[s.charAt(start)-'a']--;
            start++;
        }
        if(end-start+1>max_window){
            max_window=end-start+1;
            max_start=start;
        }
    }
    return s.substring(max_start,max_start+max_window);
    
}

public static boolean isCount(int[] count,int k){
    int u=0;
 for(int i=0;i<26;i++){
     if(count[i]>0)
     u++;
 }   
 
 return u<=k;
}


}
