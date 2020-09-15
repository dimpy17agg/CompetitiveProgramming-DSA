// { Driver Code Starts
//Initial Template for Java
import java.util.*;


 // } Driver Code Ends


//User function Template for Java

//User function Template for Java

// Helper class to implement functions
// insert : to insert element to stack
// remove : to pop element from stack
// headOf_Stack : to return top of stack
// find : to find the element in stack
class Geeks
{
    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.push(x);
    }
    
    // Function to pop element from stack
    public static Integer remove(Stack<Integer> st)
    {
        int x = st.pop();// Your code here
        return x;
    }
    
    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        int x = st.peek();// Your code here
        System.out.println(x + " ");
    }
    
    // Function to find the element in stack
    public static boolean find(Stack<Integer> st, int val)
    {
        ArrayList<Integer> l=new ArrayList<Integer>();
        boolean exists = false;
         while(st.isEmpty()==false){
             int x=st.pop();
             if(x==val){
                 exists=true;
                 st.push(x);
                 break;
             }
             else{
                 l.add(x);
             }
         }
        while(l.size()>0){
            st.push(l.remove(l.size()-1));
        }
        if(exists == true){
            return true;
        }
        else{
            return false;
        }
        
    }
}


// { Driver Code Starts.

// Driver class with Driver code
class GFG 
{
	// Driver code
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    // Declaring stack of integers
		    Stack <Integer> st = new Stack<Integer>();
		    
		    int q = sc.nextInt();
		    
		    // Working with queries
		    while(q-- > 0)
		    {
		       
		        char ch = sc.next().charAt(0);
		        
		        //Creating an object of class Geeks
		        Geeks obj = new Geeks();
		       if(ch == 'i')
		      {
		         int x = sc.nextInt();
		         
		         //calling insert method of class geeks
		         obj.insert(st, x);
		      }
		    
		      if(ch == 'r')
		      {
		          //calling remove method of class geeks
		          obj.remove(st);
		      }
		      
		      if(ch == 'h')
		      {
		          //calling headOf_Stack method of class geeks
		          obj.headOf_Stack(st);
		      }
		      if(ch == 'f')
		      {
		          int x = sc.nextInt();
		          
		          //Printing Yes if the value x
		          //is in the Stack else No
		          if(obj.find(st, x))
		          System.out.println("Yes");
		          else 
		          System.out.println("No");
		      }
		    }
		 }
	}
}  // } Driver Code Ends
