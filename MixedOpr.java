class MixedOpr
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = 15;
		System.out.println((a + b) > c);
		System.out.println((a * b) <= c);
		System.out.println((a > b) && (c > a));
		System.out.println(((a+b)==c) || (a>c));
	}
}