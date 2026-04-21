
import com.mycompany.arrayutils.ArrayUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class ArrayUtilsTest
{
    ArrayUtils au = new ArrayUtils();
    
    int[] arr = {12, 5, 8, 20, 3};
    
    @Test
    public void testFindMax()
    {
        int res = au.findMax(arr);
        assertEquals(20, res);
    }

    
    @Test
    public void testFindMin()
    {
        int res = au.findMin(arr);
        assertEquals(3, res);
    } 
}
