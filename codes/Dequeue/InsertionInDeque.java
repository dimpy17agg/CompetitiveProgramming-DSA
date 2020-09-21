// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using class Scanner
	    Scanner sc=new Scanner(System.in);
	    
	    //taking total count of testcases
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
	        //taking the total count of elements
	        int n=sc.nextInt();
	        
	        //Declaring and Initializing an array of size n
	        int arr[]=new int[n];
	        
	        //inserting the elements to the array
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	            
	        }
	        
	        //calling the method deque_Init
	        //and storing the result in a
	        //new ArrayDequeu
	        ArrayDeque<Integer> deque = deque_Init(arr,n); 
	        
	        //Printing all the elements
	        //of ArrayDeque
	        for(int x:deque)
	        {
	            System.out.print(x+" ");
	        }
	        System.out.println();
	    }
		
	}
	

 // } Driver Code Ends


//User function Template for Java



public static ArrayDeque<Integer> deque_Init(int arr[], int n)
{
    ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
    //Your code here
    for(int i=0;i<n;i++){
        
        dq.add(arr[i]);
    }
    return dq;
}

// { Driver Code Starts.


}  // } Driver Code Ends
