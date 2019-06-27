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
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=ob.nextInt();
        for(int j=0;j<n;j++)
            b[j]=a[j];
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");
            
        }}}
