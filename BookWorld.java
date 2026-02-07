import java.util.Scanner;
class BookWorld
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to BookWorld");
		System.out.println("1. Academic Books");
		System.out.println("2. story Books");
		System.out.println("3. Magazines");
		System.out.println("4. Competitive Exam Books");
		System.out.println("5. Comics Books");
		
		
		System.out.print("Enter your Book : ");
		
		int Book = sc.nextInt();
		
		if(Book==1)
		{
			System.out.println("1. Science Book");
		    System.out.println("2. Maths Book");
			
		    System.out.print("Enter your Book Id : ");
			
			int Bookid = sc.nextInt();
			
			if(Bookid ==2)
			{
				System.out.println("Maths Book - Rs.200");
			}
			else if(Bookid==1)
			{
				System.out.println("Science Book - Rs.250");
			}
			else
			{
				System.out.println("Not Available in this Book");
			}
		}
		
		else if(Book==2)
		{
			System.out.println("1. Adventure Story Book");
		    System.out.println("2. Moral Story Book");
		   
		    System.out.print("Enter your Book Id : ");
			
			int Bookid = sc.nextInt();
			
			if(Bookid==1)
			{
				System.out.println("Adventure Story Book - Rs.150");
			}
			else if(Bookid==2)
			{
				System.out.println("Moral Story Book - Rs.120");
			}
			else
			{
				System.out.println("Not Available in this Books");
			}
		}
		
		else if(Book==3)
		{
			System.out.println("1. Weekly Magazines");
		    System.out.println("2. Monthly Magazines");
		    System.out.print("Enter your Book Id : ");
			
			int Bookid = sc.nextInt();
			
			if(Bookid==1)
			{
				System.out.println("Weekly Magazines - Rs.50");
			}
			else if(Bookid==2)
			{
				System.out.println("Monthly Magazines - Rs.120");
			}
			else
			{
				System.out.println("Not Available in this Book");
			}
		}
		else if(Book==4)
		{
			System.out.println("1. Banking Exam Books");
		    System.out.println("2. SSC Exam Books");
		    System.out.print("Enter your Book Id : ");
			
			int Bookid = sc.nextInt();
			
			if(Bookid==1)
			{
				System.out.println("Banking Exam Books - Rs.40");
			}
			else if(Bookid==2)
			{
				System.out.println("SSC Exam Books - Rs.120");
			}
			else
			{
				System.out.println("Not Available in this Book");
			}
		}
		else if(Book==5)
		{
			System.out.println("1.  Kids Comics");
		    System.out.println("2. Super Hero Comics");
		    System.out.print("Enter your Book Id : ");
			
			int Bookid = sc.nextInt();
			
			if(Bookid==1)
			{
				System.out.println("Kids Comics - Rs.80");
			}
			else if(Bookid==2)
			{
				System.out.println("Super Hero Comics - Rs.120");
			}
			else
			{
				System.out.println("Not Available in this Book");
			}
		}
		else
		{
			System.out.println("Your Book is not available");
		}
		
	}
}