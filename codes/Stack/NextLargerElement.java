// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new solve().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}



// } Driver Code Ends


class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        
        long[] a=new long[n];
        Stack<Long> st=new Stack<Long>();
        st.push(arr[n-1]);
         a[n-1]=-1;
        
        for(int i=n-2;i>=0;i--){
            if(!st.isEmpty() && st.peek()>=arr[i])
              {
                  a[i]=st.peek();
                  st.push(arr[i]);
                  continue;
              }
             while(!st.isEmpty() && st.peek()<arr[i]){
                 st.pop();
             } 
            long res=st.isEmpty()?-1:st.peek();
            a[i]=res;
            st.push(arr[i]);
        }
        
        return a;
        
    } 
}
