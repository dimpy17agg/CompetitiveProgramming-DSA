// { Driver Code Starts
import java.util.*;
import java.io.*;

class WindowMaximum {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] inputline = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputline[0]);
            inputline = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputline[i]);
            }
            int[] res = new MaximumOfWindow().printMaxOfMin(arr, n);
            
            for (int i = 0; i < n; i++) 
                System.out.print (res[i] + " ");
            System.out.println ();
        }
    }
}// } Driver Code Ends


class MaximumOfWindow {

    static int[] printMaxOfMin(int[] arr, int N) {
        // Your code here
        
        int[] a=new int[N+1];
        int[] l=new int[N];
        int[] r=new int[N];
        Stack<Integer> st=new Stack<Integer>();
        
        for(int i=0;i<N;i++){
           l[i]=-1;
           r[i]=N;
        }
        
      for(int i=0;i<N;i++){
          
          while(!st.isEmpty() && arr[st.peek()]>=arr[i] ){
              st.pop();
          }
          if(!st.isEmpty()){
              l[i]=st.peek();
          }
          st.push(i);
      }
        while(!st.isEmpty()){
            st.pop();
        }
     for(int i=N-1;i>=0;i--){
        while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
        }    
        if(!st.isEmpty()){
            r[i]=st.peek();
        }
        st.push(i);
     }
     
     for(int i=0;i<N;i++)
      {
         int v=r[i]-l[i]-1;
         a[v]=Math.max(a[v],arr[i]);
      }     
     
     for(int i=N-1;i>=0;i--){
         a[i]=Math.max(a[i],a[i+1]);
     }
     int[] m=new int[N];
     for(int i=0;i<N;i++){
         m[i]=a[i+1];
     }
    return m;
   
    }
}
