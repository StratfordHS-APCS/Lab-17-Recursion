import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RecursionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RecursionTest
{
    /**
     * Factorial test.
     */
    @Test(timeout=2000)
    public void factorialTest()
    {
        int[] n = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800 };
        
        for( int i = 0; i < n.length; i++ )
        {
            assertEquals("factorial(" + n[i] + ") failed (-30 points)", result[i], Recursion.factorial(n[i]));
        }
    }
    
    /**
     * GCD test.
     */
    @Test(timeout=2000)
    public void gcdTest()
    {
        int[] x = { 12, 10, 30, 24 };
        int[] y = { 10, 15, 20, 30 };
        int[] result = { 2, 5, 10, 6 };
        
        for( int i = 0; i < x.length; i++ )
        {
            assertEquals("gcd(" + x[i] + ",, " + y[i] + ") failed (-30 points)", result[i], Recursion.gcd(x[i], y[i]));
        }
    }
    
    /**
     * Fibbonacci test.
     */
    @Test(timeout=2000)
    public void fibTest()
    {
        int[] n = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 };
        
        for( int i = 0; i < n.length; i++ )
        {
            assertEquals("fib(" + n[i] + ") failed (-30 points)", result[i], Recursion.fib(n[i]));
        }
    }
}
