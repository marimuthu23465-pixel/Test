class TrafficSignal
{
    public static void main(String[] args)
	{
		char signal = 'Y';

        switch (signal)
		{
            case 'R'->
                System.out.println("STOP");
               
            case 'Y'->
                System.out.println("READY");
               
            case 'G'->
                System.out.println("GO");
				
            default->
                System.out.println("Invalid Signal");
        }
    }
}

	