// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//taking the length of the string
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //taking the string
		   String str = br.readLine().trim();
		   
		   //calling removeConsecutiveDuplicates method of class solve
		   System.out.println(new solve().removeConsecutiveDuplicates(str));
		}
	}
}// } Driver Code Ends


class solve
{
    // Function to print string after removing consecutive duplicates
    public static String removeConsecutiveDuplicates(String str){
        // Your code here
      Stack<Character> st=new Stack<Character>();
      st.push(str.charAt(0));
      for(int i=1;i<str.length();i++){
          char c=str.charAt(i);
          if(c==st.peek()){
           //   System.out.println(c);
              continue;
          }
          st.push(c);
      }
    //  System.out.println(st.peek());
       String t="";
       while(!st.isEmpty())
       {
           t=t+String.valueOf(st.pop());
           //System.out.println(t);
       }
        StringBuffer sb=new StringBuffer(t);
        String h=String.valueOf(sb.reverse());
        return h;
    }
}
