package com.mycompany.bankaccount; 

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;


public class BankAccountTest 
{ 
    BankAccount obj = new BankAccount();
    
    @Test 
    public void testDeposit()
    {
        int res = obj.deposit(500);
        assertEquals(1500, res); 
    }
    @Test 
    public void testWithdraw() 
    {
        int res = obj.withdraw(200);
        assertEquals(800, res); 
    } 
    @Test
    public void testCheckBalance() 
    {
        int res = obj.checkBalance();
        assertEquals(1000, res);
    }
}
