package app;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest
{
    @Test
    void calculateQuadraticEquation()
    {
        double a=1,b=5,c=6;
        double[] expected={-3,-2};
        double[] actual=MathUtil.calculateQuadraticEquation(a,b,c);
        Arrays.sort(actual);
        assertArrayEquals(expected,actual);
    }
    @Test
    void calculateQuadraticEquation_discriminantLessThanZero()
    {
        double a=1,b=1,c=6;
        Exception e=assertThrows(IllegalArgumentException.class,()->MathUtil.calculateQuadraticEquation(a,b,c));
        assertEquals("Discriminant is less than zero",e.getMessage());
    }
}