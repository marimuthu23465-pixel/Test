import java.util.Scanner;
class BankAccountMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    BankAccount ba = new BankAccount();
	
	    int choice = 0;
	
	    while(choice!=4)
		{
			System.out.println("***** Account Process***** ");
		    System.out.println("1. Deposit Amount");
		    System.out.println("2. Withdraw Amount");
		    System.out.println("3. Display Amount");
		    System.out.println("4. Exit");
		
		    System.out.println("Enter your Choice : ");
		
		    choice =sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the Amount Deposited : ");
			        int deposit = sc.nextInt();
			
			        double depositAmount = ba.depositAmount(deposit);
			        System.out.println("YOU HAVE DEPOSITED  : RS " + depositAmount);
			        break;
			    }
			    case 2:
			    {
				    System.out.println("Enter the Amount Withdrawn : ");
			        int withdraw = sc.nextInt();
				
				    if(withdraw<=ba.amount)
				    {
					    double withdrawAmount = ba.withdrawAmount(withdraw);
			            System.out.println("YOU HAVE withdrawned  : RS " + withdrawAmount);
				    }
				    else
			            {
						    System.out.println("Insufficient Balance !!");
			            }
					    break;
			    }
				case 3:
				{
			        double displayAmount = ba.displayAmount();
			        System.out.println("YOU HAVE : RS " + displayAmount);
			        break;
			    }
			    case 4:
			    {
				    System.out.println("Exiting...");
				    break;
			    }
			    default:
				{
				    System.out.println("Invalid Choice!...");
			    }
		    }
		}
		sc.close();
		
	}
}