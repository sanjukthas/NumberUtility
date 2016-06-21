package DaltonBank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Dalton Corp Savings and Loan");
		System.out.println("Please create the user account(s)");
		List accounts = new ArrayList<Account>();
		List trnsList = new ArrayList<Transactions>();
		System.out.println("Enter an account # or -1 to stop entering accounts:");
		int accountNum = in.nextInt(); 
		if (accountNum != -1) {
			int k = 0; 
					do  { 
						Account account = new Account();
					   account.setAccountNumber(accountNum);
					System.out.println ("Enter the name for acct # " + accountNum + ":");
					String name = in.next(); 
					   account.setName(name);
							   System.out.println ("Enter the balance for acct # " + accountNum   + ":");
							   int balance = in.nextInt(); 
					  account.setBalance(balance);
					   k++;
					   accounts.add(account);
							   System.out.println ("Enter an account # or -1 to stop entering accounts:");
					   accountNum =  in.nextInt(); 
					}
					  while(accountNum != -1) ;
					
		}
		 
		
		System.out.println("Enter a transaction type (Check (0), Debit card(1), Deposit(2) or Withdrawal(3)) or -1 to finish :");
		String transactionType = checkType(in.nextInt()); 
		
		
		if (transactionType != "Break") {
			int k = 0; 
					do  { 
						Transactions transactions = new Transactions();
					   transactions.setType(transactionType);
					System.out.println ("Enter the acct # " + accountNum + ":");
					int num = in.nextInt(); 
					   transactions.setAccountNum(num);
							   System.out.println ("Enter the amount of the " + transactionType  + ":");
							   float amount = in.nextFloat(); 
					  transactions.setAmount(amount);
					  System.out.println ("Enter the date of the " + transactionType  + ":");
					  String inp = in.next(); 
					  DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
					  Date date = format.parse(inp); 
					  
			  transactions.setTransDate(date);
					   k++;
					   trnsList.add(transactions);
					   System.out.println("Enter a transaction type (Check (0), Debit card(1), Deposit(2) or Withdrawal(3)) or -1 to finish :");
					   transactionType =  checkType(in.nextInt()); 
					}
					  while(transactionType != "Break") ;
					
		}

		   Table Transaction = sort(Transaction, 4)

		   balance = processTransactions(Transaction, Account)

		   FOR all distinct accounts in Transactions
		   System.out.println "The balance for account" +  account + " is " + balance
		   END FOR

		   sort(Table a, ColNum b)
		    sort a based on b

		   balance (Table a, Table b)
		    type = a.transactionType
		    account = a.account
		    balance = b.balance where b.account = account
		    IF type = check
		     b.balance = balance + a.ammount
		    ELSE IF type =  Debit Card
		     temp = balance - a.amount
		     IF temp >= 0
		      b.balance = temp
		     ELSE
		      b.balnce = temp - 35
		     
		     END balance

	}

	private static String checkType(int next) {
		String transactionType = null;
		switch(next) {
		case 0: transactionType = "Check"; break;
		case 1: transactionType = "Debit card"; break;
		case 2: transactionType = "Deposit"; break;
		case 3: transactionType = "Withdrawal"; break;
		case -1: transactionType = "Break";
		}
		return transactionType;
	}

}
