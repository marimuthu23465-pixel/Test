class Calculator
{
    public static void main(String[] args)
	{
		int a = 10;
        int b = 20;
        char Z = '+';

        if (Z== '*')
		{
            System.out.println(a + b);
        }
		else if (Z == '-')
		{
            System.out.println(a - b);
        }
		else if (Z =='*')
		{
            System.out.println(a * b);
        }
		else if (Z == '/')
		{
            System.out.println(a / b);
        }
		else
		{
            System.out.println("Invalid Operator");
        }
    }
}
