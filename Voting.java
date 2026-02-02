class Voting
{
    public static void main(String[] args)
	{
        int age = 20;
        boolean citizen = true;
        if (age >= 18 && citizen)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not Eligible");
    }
}
