class MovieTickets
{
	public static void main(String[] args)
	{
		int age = 22;
		
		if(age<12)
		{
		System.out.println("Ticket Price : 80");
		}
		else if((age>=12)&&(age<=59))
		{
			System.out.println("Ticket Price : 150");
		}
		else if(age>=60)
		{
			System.out.println("Ticket Price : 100");
		}
		else
		{
			System.out.println("Invalid age");
		}
	}
}