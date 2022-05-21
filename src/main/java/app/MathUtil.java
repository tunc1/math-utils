package app;

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
}