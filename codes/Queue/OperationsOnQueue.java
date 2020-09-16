// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG { 
    
    public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int inputN = inputLine.length;
		    GfgQueue gq = new GfgQueue();
		    try{
    		    for(int i=0, k=0; i<n; i++){
    		        if(inputLine[k].equals("i")){
    		            k++;
    		            gq.enqueue(Integer.parseInt(inputLine[k]));
    		            k++;
    		        }
    		        if(inputLine[k].equals("h")){
    		            k++;
    		            System.out.println (gq.front());
    		        }
    		        if(inputLine[k].equals("r")){
    		            k++;
    		            gq.dequeue();
    		        }
    		        if(inputLine[k].equals("f")){
    		            k++;
    		            System.out.println(gq.find(Integer.parseInt(inputLine[k])));
    		            k++;
    		        }
    		        if(k==inputN)break;
    		    }
		    } catch (ArrayIndexOutOfBoundsException ex){
		        continue;
		    }
		}
	}
}// } Driver Code Ends


//User function Template for Java
class GfgQueue {
    int front;
    int rear;
    int size=0;
    int[] ar;
    GfgQueue(){
        front=0;
        rear=0;
        ar=new int[100000];
    }
    
    void enqueue(int x){
        // Code here
        ar[rear]=x;
        rear++;
        
    }
    void dequeue(){
        // code here
       if(front==rear)
       return ;
       int x=ar[front];
       front++;

    }
    int front(){
        // Code here
        if(front==rear)
        return -1;
        return ar[front];
    }
    String find(int x){
        // Code here
        for(int i=front;i<rear;i++){
            if(ar[i]==x)
            return "Yes";
        }
        return "No";
    }
}
