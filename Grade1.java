class Grade1
{
	public static void main(String[] args)
	{
		int mark = 82;
		
		if((mark>=90)&&(mark<=100))
		{
			System.out.println("Grade:A");
		}
		else if((mark>=70)&&(mark<90))
		{
			System.out.println("Grade:B");	
		}
		else if((mark>=50)&&(mark<70))
		{
			System.out.println("Grade:C");	
		}
		else if((mark>=0)&&(mark<50))
		{
			System.out.println("Fail");	
		}
		else
		{
			System.out.println("Invalid Mark");	
		}
		
	}
}