package DaltonBank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class BankMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Dalton Corp Savings and Loan");
		System.out.println("Please create the user account(s)");
		List<Account> accounts = new ArrayList<Account>();
		List<Transactions> trnsList = new ArrayList<Transactions>();
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

		Collections.sort(trnsList, new Comparator<Transactions>() {
	        @Override public int compare(Transactions p1, Transactions p2) {
	            return p1.getTransDate().compareTo(p2.getTransDate()); // Ascending
	        }

	    });

		   float balance = processTransactions(trnsList, accounts);

		   for(Transactions t: trnsList)
		    System.out.println("The balance for account" +  t.getAccountNum() + " is " + balance);
		  

		   


	}

	private static float processTransactions(List<Transactions> trnsList, List<Account> accounts) {
		for (Transactions trns: trnsList) {
			String type = trns.getType();
			int account = trns.getAccountNum();
			float balance = 0.0;
			for (Account acc: accounts) 
				if (acc.getAccountNumber() == account)
					balance = acc.getBalance();
			
		}
		
			    balance = b.balance where b.account = account
			    IF type = check
			     b.balance = balance + a.ammount
			    ELSE IF type =  Debit Card
			     temp = balance - a.amount
			     IF temp >= 0
			      b.balance = temp
			     ELSE
			      b.balnce = temp - 35
		return 0;
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
