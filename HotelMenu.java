import java.util.Scanner;
class HotelMenu
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Aakash Bhavan");
		System.out.println("1. Dosa");
		System.out.println("2. Biriyani");
		System.out.println("3. Fried Rice");
		System.out.print("Enter your choise : ");
		
		int choise = sc.nextInt();
		
		if(choise==1)
		{
			System.out.println("1. Masal Dosa");
		    System.out.println("2. Egg Dosa");
		    System.out.println("3. Kari Dosa");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Masal Dosa - Rs.50");
			}
			else if(option==2)
			{
				System.out.println("Egg Dosa - Rs.60");
			}
			else if(option==3)
			{
				System.out.println("Kari Dosa - Rs.200");
			}
			else
			{
				System.out.println("Not Available this type of dosa");
			}
		}
		
		else if(choise==2)
		{
			System.out.println("1. Chicken Biriyani");
		    System.out.println("2. Mutton Biriyani");
		    System.out.println("3. Prawn Biriyani");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Chicken Biriyani - Rs.150");
			}
			else if(option==2)
			{
				System.out.println("Mutton Biriyani - Rs.260");
			}
			else if(option==3)
			{
				System.out.println("Prawn Biriyani - Rs.350");
			}
			else
			{
				System.out.println("Not Available this type of Biriyani");
			}
		}
		
		else if(choise==3)
		{
			System.out.println("1. Chicken Fried Rice");
		    System.out.println("2. Egg Fried Rice");
		    System.out.println("3. Panner Fried Rice");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Chicken Fried Rice - Rs.100");
			}
			else if(option==2)
			{
				System.out.println("Egg Fried Rice - Rs.80");
			}
			else if(option==3)
			{
				System.out.println("Panner Fried Rice - Rs.150");
			}
			else
			{
				System.out.println("Not Available this type of Fried Rice");
			}
		}
		
		else
		{
			System.out.println("Your Choise is not available");
		}
		
	}
}