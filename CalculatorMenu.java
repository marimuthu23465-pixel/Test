import java.util.Scanner;

class CalculatorMenu
{

    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);
		
        int choice;

        do
		{
            System.out.println("\n--- CALCULATOR ---");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
			System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
			
			if(choice >= 1 && choice <= 4)
			{

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch(choice)
				{

                    case 1:
                        System.out.println("Result = " + (num1+num2));
                        break;

                    case 2:
                        System.out.println("Result = " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Result = " + ( num2 * num1));
                        break;

                    case 4:
                        if(num2 != 0)
                            System.out.println("Result = " + ( num1 / num2));
                        else
                            System.out.println("Cannot divide by zero");
                        break;
						
					default:
					     System.out.println("Invalid Choice!....");
				}
			}
			else if(choice == 5)
			{
				System.out.println("Exiting!...");
			}
			else
			{
				System.out.println("Invalid Choice!");
			}
		}while(choice!=5);
		
		sc.close();
	}
}
	
