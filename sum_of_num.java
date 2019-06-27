import java.io.*;
import java.util.*;

class sum_of_num
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        while(t-->0){
            int a=ob.nextInt();
            int b=ob.nextInt();
            int sum=0;
            sum=a+b;
            System.out.println(sum);
        }
    }
}
