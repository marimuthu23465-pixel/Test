
package primeOrNot;


public class Prime
{

 
    public static void main(String[] args)
    {
      
      
        int num = 24;  

        PrimeTemplate pt = new PrimeTemplate();

        if (pt.checkPrime(num))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");
    }
}    
    