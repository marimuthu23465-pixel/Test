package fibonacci;

import java.util.Scanner;

public class Fibonacci
{

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        FibonacciTemplate ft = new FibonacciTemplate();
        ft.printSeries(n);
    }
    
}
