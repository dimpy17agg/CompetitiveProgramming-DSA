// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //Taking input using class Scanner 
        Scanner sc = new Scanner(System.in);
        
        //Taking the number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking the range
            long n = sc.nextLong();
            
            //creating an ArrayList
            ArrayList<String> res = new ArrayList<String>();
            
            //calling the generate method of class solve
            //and storing the result in an ArrayList
            res = new solve().generate(n);
            
            //printing all the elements of the ArrayList
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


class solve{
    static ArrayList<String> generate(long n)
    {
        // Your code here
    
        Queue<String> q=new LinkedList<String>();
        ArrayList<String> l=new ArrayList<String>();
        q.add("1");
        for(int i=0;i<n;i++){
          String t= q.poll();
          l.add(t);
            q.add((t+"0"));
            q.add((t+"1"));
        }
        return l;
        
        
    }
    
}
