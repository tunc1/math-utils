package app;

import java.util.LinkedList;
import java.util.List;

public class MathUtil
{
    public static double[] calculateQuadraticEquation(double a,double b,double c)
    {
        double d=b*b-4*a*c;
        if(d<0)
            throw new IllegalArgumentException("Discriminant is less than zero");
        d=Math.sqrt(d);
        double x1=(-1*b+d)/2*a;
        double x2=(-1*b-d)/2*a;
        return new double[]{x1,x2};
    }
    public static boolean isASquareNumber(int a)
    {
        for(int i=0;i<a;i++)
        {
            if(i*i==a)
                return true;
        }
        return false;
    }
    public static int highestCommonFactor(int a,int b)
    {
        int smallest=Math.min(a,b);
        int highest=1;
        for(int i=2;i<=smallest;i++)
        {
            if(a%i==0&&b%i==0&&i>highest)
                highest=i;
        }
        return highest;
    }
    public static List<Integer> divisors(int a)
    {
        List<Integer> list=new LinkedList<>();
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                list.add(i);
        }
        return list;
    }
    public static boolean isPrime(int a)
    {
        if(a==1)
            return false;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static int factorial(int n)
    {
        int result=1;
        for(int i=1;i<=n;i++)
            result*=i;
        return result;
    }
    public static int fibonacci(int n)
    {
        int result=1,tmp=1;
        for(int i=0;i<n;i++)
        {
            result+=tmp;
            tmp=result-tmp;
        }
        return result;
    }
}