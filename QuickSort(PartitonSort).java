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

public class PartitionSort
{
    public static int[] quickSort(int[] arr,int n)
    {
        int p,a=0,b=0,c=0;
        p=arr[0];
        int l[]=new int[n];
        int r[]=new int[n];
        int e[]=new int[n];
        int sorta[]=new int[n];
        for(int i=0;i<n;i++)
        {
        if(arr[i]>=-1000 && arr[i]<=1000)
        {
            if(arr[i]<p)
            {
                l[b]=arr[i];
                b++;
            }
            if(arr[i]==p)
            {
                e[c]=arr[i];
                c++;
            }
            if(arr[i]>p)
            {
            r[a]=arr[i];
            a++;
            }
        }
        }
        int d=0;
        for(int i=0;i<b;i++)
        {
            sorta[d]=l[i];
            d++;
        }
        for(int i=0;i<c;i++)
        {
            sorta[d]=e[i];
            d++;
        }
        for(int i=0;i<a;i++)
        {
            sorta[d]=r[i];
            d++;
        }
        return sorta;     
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        if(n>=1 && n<=1000)
        {
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        b=quickSort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
        }
    }
}
