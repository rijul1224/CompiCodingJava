import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[][]=new String[n][2];
        int x[]=new int[n];
        String s[][]=new String[100][n];
        if(n>=1 && n<=1000000 && n%2==0)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
            arr[i][j]=sc.next();
            }
            if(i<n/2)
            {
                arr[i][1]="-";
            }
            x[i]=Integer.parseInt(arr[i][0]);
        }
        for(int i=0;i<100;i++)
        {
            for(int k=0;k<n;k++)
            {
                if(x[k]==i)
                {
                    System.out.print(arr[k][1]+" ");
                }
            }
        }
    }
}
}
