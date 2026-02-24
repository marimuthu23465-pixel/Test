import java.util.Scanner;

class ATM
{

    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        double Balance = 1000;   // Main variable (change name based on question)
        int choice;

        do
		{
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice)
			{

                case 1:
                    System.out.print("Enter Your Deposit Amount : ");
                    double depositAmount = sc.nextDouble();
                    Balance = Balance + depositAmount;
                    System.out.println("Current Balance : "+Balance);
                    break;

                case 2:
                    System.out.print("Enter Your Withraw Amount : ");
                    double withrawAmount = sc.nextDouble();

                    if(withrawAmount <= Balance)
					{
                        Balance = Balance - withrawAmount;
                        System.out.println("Withrawed Successfully!");
						System.out.println("Current Balance : "+Balance);
                    }
					else
					{
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance = " + Balance);
                    break;

                case 4:
                    System.out.println("Existing!...");
                    break;

                default:
                    System.out.println("Invalid Choice!...");
            }

        } while(choice != 4);

        sc.close();
    }
}