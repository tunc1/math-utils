package app;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
    @Test
    void divisors()
    {
        List<Integer> divisors=MathUtil.divisors(120);
        List<Integer> expected=List.of(1,2,3,4,5,6,8,10,12,15,20,24,30,40,60,120);
        assertEquals(expected,divisors);
    }
    @Test
    void isPrime_prime()
    {
        assertTrue(MathUtil.isPrime(5));
    }
    @Test
    void isPrime_notPrime()
    {
        assertFalse(MathUtil.isPrime(6));
    }
    @Test
    void isPrime_1()
    {
        assertFalse(MathUtil.isPrime(1));
    }
    @Test
    void factorial_0()
    {
        assertEquals(1,MathUtil.factorial(0));
    }
    @Test
    void factorial()
    {
        assertEquals(720,MathUtil.factorial(6));
    }
}