import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        while(t-->0){
            int n=ob.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++)
                a[i]=ob.nextInt();
            int visited=-1;
            for(int i=0;i<n;i++){
                int c=1;
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]==a[j]){
                        c++;
                        b[j]=visited;
                    }
                }
                if(b[i]!=visited)
                    b[i]=c;
            }
            for(int i=0;i<n;i++)
            {
                if(b[i]!=visited)
                    System.out.println(a[i]+"-"+b[i]);
            }
	}
}}
