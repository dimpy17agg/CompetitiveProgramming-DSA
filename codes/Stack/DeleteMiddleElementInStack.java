// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    
	    //Taking input total testcases
	    int testcases=sc.nextInt();
	    
	    while(testcases-->0)
	    {
	        //Taking the total number of elements in the stack
	        int sizeOfStack =sc.nextInt();
	        
	        
	        Stack <Integer> myStack=new Stack<>();
	        
	        //adding elements to the stack
	        for(int i=0;i<sizeOfStack;i++)
	        {
	            int x=sc.nextInt();
	            myStack.push(x);
	            
	        }
	        
	        //stack size is 1 
	        //then just ouput the first element
	        if(sizeOfStack==1)
	        {
	            System.out.println(myStack.peek());
	        }
	        else
	        {
	            Geeks obj=new Geeks();
	            
	            //calling deleteMid method of class Geeks
	            //which gives a new stack after removing
	            //the middle element
	            Stack <Integer> modified=obj.deleteMid(myStack,sizeOfStack,0);
	            
	            //printing all the elements 
	            // of the modified stack
	            while(!modified.isEmpty())
	            {
	                System.out.print(modified.peek()+" ");
	                modified.pop();
	            }
	            System.out.println();
	        }
	    }
	    
	    
	}
}
// } Driver Code Ends


//User function Template for Java

class Geeks
{
    //Complete this function
    public Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current)
    {
        //Your code here
      int index=(int)(Math.ceil((double)(sizeOfStack/2)));
     if(sizeOfStack%2==0)
     index--;
     s.remove(index);
     //  Collections.reverse(s);
      return s;
    } 
}

