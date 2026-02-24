import java.util.Scanner;
class Maximum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*****************************");
		System.out.print("ENTER THE ARRAY LENGTH: ");
		int length=sc.nextInt();
		//new keyword
		int age[]=new int[length];
		// INSERT INTO VALUE FROM THE USER
		for(int i=0;i<age.length;i++)
		{
			System.out.print("ENTER THE "+i th +"INDEX VALUE :");
			age[i]=sc.nextInt();
			
		}
		int max=age[0];
		for(int i=0;i<age.length;i++)
		{
			if(age[i]>max)
			{
				max=age[i];
			}
			
		}
		System.out.println("THE Maximum AGE IS :"+max);
		
		
		
	}
	
	
	
	
	
	
	
}