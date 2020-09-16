// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new solve().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends


class solve{
    
    // Function to calculate span
    // price[]: input array
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] ar=new int[n];
        Stack<Integer> st=new Stack<Integer>();
        st.push(0);
        ar[0]=1;
        for(int i=1;i<n;i++){
            if(!st.isEmpty() && price[st.peek()]>price[i]){
                ar[i]=1;
                st.push(i);
                continue;
            }
            while(!(st.isEmpty()) && price[st.peek()]<=price[i]){
                st.pop();
            }
            
            int r=st.isEmpty()?i+1:i-st.peek();
            ar[i]=r;
            st.push(i);
        }
        return ar;
    }
    
}
