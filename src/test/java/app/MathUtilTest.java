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
    @Test
    void isASquareNumber_returnsTrue()
    {
        assertTrue(MathUtil.isASquareNumber(9));
    }
    @Test
    void isASquareNumber_returnsFalse()
    {
        assertFalse(MathUtil.isASquareNumber(5));
    }
    @Test
    void highestCommonFactor()
    {
        assertAll("highestCommonFactor",
                ()->assertEquals(2,MathUtil.highestCommonFactor(6,4)),
                ()->assertEquals(1,MathUtil.highestCommonFactor(8,9)),
                ()->assertEquals(10,MathUtil.highestCommonFactor(80,70)),
                ()->assertEquals(3,MathUtil.highestCommonFactor(6,9)));
    }
}