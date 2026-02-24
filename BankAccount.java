import java.util.Scanner;

class BankAccount
{
	double depositAmount()
	{
		
	}
	double  displayAmount()
	{
		
	}
	double withrawAmount()
	{
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();
		
		int option = 0;
		
		{
			while(option != 5)
        {
            System.out.println("----- Welcome To Bank Of Magizhchi -----");
            System.out.println("1. DepositAmount");
            System.out.println("2. DisplayAmount");
            System.out.println("3. WithrawAmount");
            System.out.println("4. Exit");
			
            System.out.print("Enter your option: ");
            option = sc1.nextInt();

            switch(option)
			{
                case 1:
				{
					Syste.out.println("Enter the DepositAmount : ");
					double depositAmount = ba.depositAmount();
					System.out.println("You've Deposited Rs : "+depositAmount);
					break;
				}
				case 2:
				{
					double displayAmountAmount = ba.displayAmount ();
					System.out.println("Your Balance Rs : "+displayAmount);
					break;
				}
				case 3:
				{
					System.out.println("Enter the Withraw Amount : ");
					double WithrawAmountAmount = ba.withrawAmount ();
					System.out.println("You've Withrawed Rs : "+withrawAmount);
					break;
				}
				case 4:
				{
					System.out.println("Existing");
					break;
				}
				default:
				{
					System.out.println("Invalid option");
				}
			}
		}
		
	
		