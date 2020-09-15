// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Reading number of testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		   //Reading the string that needs to processed
		   String str = br.readLine().trim();
		   
		   //calling the removePair method of class solve
		   String ans=new solve().removePair(str);
		   
		   //if the new processed string is empty
		   //then we print "Empty String"
		   if(ans.length()<=0)
		   System.out.println("Empty String");
		   
		   //otherwise we print the new string
		   else
		   System.out.println(ans);
		}
	}
}// } Driver Code Ends


class solve
{
    // Function to print string after removing consecutive duplicates
    public static String removePair(String str){
        // your code here
    
        Stack<Character> st=new Stack<Character>();
        st.push(str.charAt(0));
        for(int i=1;i<str.length();i++){
          Character c=str.charAt(i);
          if((!st.isEmpty()) && st.peek()==c){
              st.pop();
          }
          else{
              st.push(c);
          }        
        }
        if(st.isEmpty())
        return "";
        String s="";
        while(!st.isEmpty()){
            s=s+st.pop();
        }
        StringBuffer sb=new StringBuffer(s);
        String t=String.valueOf(sb.reverse());
        return t;
    }
}
