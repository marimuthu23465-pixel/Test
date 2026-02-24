import java.util.Scanner;

public class UniversalMenudriven
{

    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        double value = 100;   // Main variable (change name based on question)
        int choice;

        do
		{
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice)
			{

                case 1:
                    System.out.print("Enter value to add: ");
                    double add = sc.nextDouble();
                    value = value + add;
                    System.out.println("Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter value to subtract: ");
                    double sub = sc.nextDouble();

                    if(sub <= value) {
                        value = value - sub;
                        System.out.println("Subtracted Successfully!");
                    } else {
                        System.out.println("Insufficient Value!");
                    }
                    break;

                case 3:
                    System.out.print("Enter value to multiply: ");
                    double mul = sc.nextDouble();
                    value = value * mul;
                    System.out.println("Multiplied Successfully!");
                    break;

                case 4:
                    System.out.println("Current Value = " + value);
                    break;

                case 5:
                    System.out.println("Program Ended!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}