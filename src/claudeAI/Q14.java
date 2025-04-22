package claudeAI;
//Exercise 14: Packages
//Target Concept: Packages and visibility modifiers
//Create a package structure for a simple banking application with two packages:
//
//bank.accounts containing a class Account
//bank.customers containing a class Customer
//
//Make sure to use appropriate visibility modifiers to allow the classes to interact.


import dev.hexawulf.bank.accounts.Account;
import dev.hexawulf.bank.customers.Customer;




public class Q14
{

	public static void main(String[] args)
	{
        System.out.println("Fully Qualified Class Names:");

        System.out.println(Account.class.getName());
        System.out.println(Customer.class.getName());
    }

	}


