import java.io.*;
import java.util.*;

class sum_of_num
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        while(t-->0){
        int n=ob.nextInt();
        int r=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=ob.nextInt();
        for(int i=0;i<r;i++)
        {
            int j,first;
            first=a[0];
            for(j=0;j<n-1;j++)
            {
                a[j]=a[j+1];
            }
            a[j]=first;
        }
            
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
        }}}
