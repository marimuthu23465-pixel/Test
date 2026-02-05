class BatteryStatus
{
	public static void main(String[] args)
	{
		int B = 98;
		
		if(B>=80)
		{
		System.out.println("Battery Full");
		}
		else if((B>=30)&&(B<=79))
		{
			System.out.println("Battery Normal");
		}
		else if(B<30)
		{
			System.out.println("Low Battery! - Charge Now");
		}
		else
		{
			System.out.println("Invalid Battery Percentage");
		}
	}
}