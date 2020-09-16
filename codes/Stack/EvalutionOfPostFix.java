// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new solve().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class solve{
    public static int evaluatePostFix(String exp){
        // Your code here
        
        Stack<Integer> st=new Stack<Integer>();
         int res=0;    
        for(int i=0;i<exp.length();i++){
            
            char c=exp.charAt(i);
            if(Character.isDigit(c)){
               int a=Character.getNumericValue(c);
               st.push(a);
            }
            else{
                if(st.isEmpty())
                return -1;
                int op2=st.pop().intValue();
                if(st.isEmpty())
                return -1;
                int op1=st.pop().intValue();
                       
                if(c=='*')
                res=op1*op2;
                else if(c=='/')
                res=op1/op2;
                else if(c=='+')
                res=op1+op2;
                else if(c=='-')
                res=op1-op2;
                
                st.push(res);
            }
            
        }
    return res;
    }
    
}
