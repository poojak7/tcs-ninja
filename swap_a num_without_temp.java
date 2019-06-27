import java.io.*;
import java.util.*;

class sum_of_num
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        while(t-->0){
            int b=ob.nextInt();
            int a=ob.nextInt();
            b=b+a;
            a=b-a;
            b=b-a;
            System.out.println(b);
            System.out.println(a);
        }}}
