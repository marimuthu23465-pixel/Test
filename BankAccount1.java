class BankAccount
{
	double amount = 1000;
	
	double depositAmount(double deposit)
	{
		amount+=deposit;
		return deposit;
	}
	double withdrawAmount(double withdraw)
	{
		amount-=withdraw;
		return withdraw;
	}
	double displayAmount()
	{
		return amount;
	}
}
