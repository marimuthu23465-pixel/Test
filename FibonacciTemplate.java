
package fibonacci;


public class FibonacciTemplate
{
    void printSeries(int n) 
    {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b);

        for(int i = 1; i <= n; i++) 
        {
            
            int c = a + b;
            System.out.print(" " +c);
            a = b;
            b = c;
        }
    }
    
}
