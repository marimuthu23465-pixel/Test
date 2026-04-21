
import com.mycompany.numberutils.NumberUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class NumberUtilsTest
{
    NumberUtils nu = new NumberUtils();

    
    @Test
    public void testFactorial()
    {
        int res = nu.factorial(5);
        assertEquals(120, res);
    }

    
    @Test
    public void testIsPrime() 
    {
        boolean res = nu.isPrime(5);
        assertTrue(res);
    }

    
    @Test
    public void testIsNotPrime()
    {
        boolean res = nu.isPrime(8);
        assertFalse(res);
    }
    
}
