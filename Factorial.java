package factorial;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        FactorialTemplate ft = new FactorialTemplate();

        int result = ft.factorial(num);

        System.out.println("Factorial = " + result);
    }
}
    
