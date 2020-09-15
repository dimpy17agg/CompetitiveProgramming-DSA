// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class getMin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Taking all the testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //Taking total number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //adding all the elements to the array
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
             
            //calling _push method of class GetMin 
            //and storing the result in a new Stack
            Stack<Integer>mys = new GetMin()._push(arr,n);
            
            //calling _getMinAtPop method of class GetMin
            new GetMin()._getMinAtPop(mys);
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


class GetMin
{
    static int min=Integer.MAX_VALUE;
 //   static ArrayList<Integer> l;
    /* inserts elements of the array into 
        stack and return the stackn*/
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
   //     l=new ArrayList<Integer>();
     //   l.min(arr[0]);
        Stack<Integer> st=new Stack<Integer>();
        st.push(arr[0]);
        int y=arr[0];
        for(int i=1;i<n;i++){
             if(arr[i]<y){ 
            st.push(arr[i]);
            y=arr[i];
             }
             else{
                 st.push(y);
             }
       //     int min=Collections.min(l).intValue();
         //   int x=(int)Math.min(min,arr[i]);
           // l.add(x);
        }
        return st;
    }
    
    /* print minimum element of the stack each time
       after popping*/
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while(!s.isEmpty())
        System.out.print(s.pop()+" ");
        
    }
}
