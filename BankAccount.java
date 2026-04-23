
package com.mycompany.bankaccount;



public class BankAccount 
{

    int balance = 1000;

   
    public int deposit(int amount)
    {
        balance = balance + amount;
        return balance;
    }

    
    public int withdraw(int amount) 
    {
        balance = balance - amount;
        return balance;
    }

    
    public int checkBalance()
    {
        return balance;
    }
}
