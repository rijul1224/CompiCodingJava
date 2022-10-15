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
        }
        for(int i=0;i<n/2;i++)
        {
            for(int j=1;j<2;j++)
            {
                arr[i][j]="-";
            }
        }
        for(int i=0;i<n;i++)
        {
            x[i]=Integer.parseInt(arr[i][0]);
        }
        int temp;
        int c[]=new int[100];
        for(int i=0;i<100;i++)
        {
            c[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]>=0 && x[i]<100)
            {
                for(int j=0;j<100;j++)
                {
                if(x[i]==j)
                {  
                    c[j]=c[j]+1;
                    break;
                }
                }
                }
        }
        for(int i=0;i<100;i++)
        {
            for(int j=0;j<c[i];j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(x[k]==i)
                    {
                        s[i][j]=arr[k][1];
                        j++;
                    }
                }
                
            }
        }
            for(int i=0;i<100;i++)
            {
                for(int j=0;j<c[i];j++)
                {
                System.out.print(s[i][j]+" ");
                }
            }
    }
}
}
