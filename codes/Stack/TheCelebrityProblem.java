// { Driver Code Starts
import java.util.*;


class Celebrity_Problem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			int M[][] = new int[N][N];
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					M[i][j] = sc.nextInt();
				}
			}
		System.out.println(new Celebrity().getId(M,N));
		t--;
		}
	}
}
// } Driver Code Ends


class Celebrity
{
    // The task is to complete this function
    int getId(int M[][], int n)
    {
        // Your code here
                 int p=0;
                 int k=-1;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(M[i][j]==0){
                    c++;
                }
            }
            if(p>=2){
            k=-1;
            break;
            }
            if(p==0 && c==n){
            k=i;
            p++;
            }
        }
         if(k==-1)
         return -1;
       for(int i=0;i<n;i++){
           
              if(i!=k && M[i][k]!=1)
              return -1;
       }
       return k;
       
    }
}
