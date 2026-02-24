import java.util.Scanner;

class AlphaExam1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the length : ");
		int len = sc.nextInt();
		
		int ar[] = new int[len];		
		
		for(int i = 0;i<ar.length;i++)
		{
			System.out.print("Enter the value of "+ i + " index : ");
			ar[i]= sc.nextInt();
		}
		
		for(int i = 0;i<ar.length;i++)
		{
			boolean duplicate = false;
			
			for(int j = 0;j < i;j++)
			{
				if(ar[j] == ar[i])
				{
					duplicate = true;
					break;
				}
				
			}
			if(!duplicate)
				{
					System.out.println(ar[i] + " ");
				}
		}
		
	}
}