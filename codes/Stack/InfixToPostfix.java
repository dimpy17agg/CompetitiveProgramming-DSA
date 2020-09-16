// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new solve().infixToPostfix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class solve{
	public static String infixToPostfix(String exp) {
		// Your code here
	
	    Stack<Character> st=new Stack<Character>();
	    String t="";
	    for(int i=0;i<exp.length();i++){
	        char c=exp.charAt(i);
	         if(Character.isLetterOrDigit(c)){
	            t=t+c;
	        }
	        else if(c=='('){
	         st.push(c);   
	        }
	        else if(c==')'){
	            while(!st.isEmpty() && st.peek()!='('){
	                t=t+st.pop();
	            } 
	            if(!st.isEmpty() && st.peek()!='(')
	             return "Invalid Expression";
	            // if(st.isEmpty())
	            // return "Invalid Expression";
	             st.pop(); 
	        }
	        else{
	           while(!st.isEmpty() && prec(c)<=prec(st.peek()) ){
	               t=t+st.pop();
	           } 
	          st.push(c);  
	        }
	        //System.out.println(st);
	    }
	    while(!st.isEmpty()){
	         if(st.peek()=='(')
	         return "Invalid";
	         t=t+st.pop();
	    }
	    
	    return t;
	    
	} 
	static int prec(char c){
	    if(c=='+' || c=='-')
	    return 1;
	    else if(c=='*' || c=='/')
	    return 2;
	    else if(c=='^')
	    return 3;
	 return -1;   
	}
}
