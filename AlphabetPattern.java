class AlphabetPattern
{
	public static void main(String[] args)
	{
		char A1 = 'A';
		char A2 ='E';
		
		for(char i=A1;i<=A2;i++)
		{
			for(char j=A1;j<=i;j++)
			{
				System.out.print(j);
			}
				System.out.println();
			
		}
	}
}