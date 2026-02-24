import java.util.Scanner;

class BankProcess
{
	double amount = 0;
	double deposit Amount()
	{
		amount += deposit;
		return deposit;
		
	}
	double  displayAmount()
	{
		return amount;
		
	}
	double withrawAmount;
		return Withraw;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BankProcess bp = new BankProcess();
		
		int option = 0;
		
			while(option != 4)
        {
            System.out.println("----- Welcome To Bank Of Magizhchi -----");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Display Amount");
            System.out.println("3. Withraw Amount");
            System.out.println("4. Exit");
			
            System.out.print("Enter your option: ");
            option = sc.nextInt();

            switch(option)
			{
                case 1:
				{
					Syste.out.println("Enter the DepositAmount : ");
					int deposit = sc.nextInt();
					
					double depositAmount = bp.deposit
					Amount();
					System.out.println("You've Deposited Rs : "+deposit Amount);
					break;
				}
				case 2:
				{
					double displayAmount = bp.display Amount ();
					System.out.println("Your Balance Rs : "+display Amount);
					break;
				}
				case 3:
				{
					System.out.println("Enter the Withraw Amount : ");
					double WithrawAmount = bp.withrawAmount ();
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
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		\