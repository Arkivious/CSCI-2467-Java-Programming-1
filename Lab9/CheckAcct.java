/*
	Chapter 10:	Account program
	Programmer: Arkivious Fischer
	Date:       4/1/2019
	Filename:	BankAcctDemo.java
	Purpose:    This program is designed to record banking transactions
*/


public class CheckAcct
{
	// data field
	private int id;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;

	// creating constructors
	CheckAcct(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	CheckAcct(int newId, double newBalance){

		id = newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}

	//Defining methods
	public int getId(){

		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public double getBalance(){

		return balance;
	}
	public void setBalance(double balance){

		this.balance = balance;
	}
	// get annualInteterestRate
	public static double getAnnualInterestRate(){

		return annualInterestRate;
	}

    // set annualInterestRate
	public static void setAnnualInterestRate(double interest){

		annualInterestRate = interest;
	}
	// getter that will return the date
	public java.util.Date getDateCreated(){

		return dateCreated;
	}
	// computations
	public double getMonthlyInterest(){

		double monthlyRate = annualInterestRate / 12.0;

		return balance * monthlyRate;
	}
 	// Methods for withdrawal and deposits
	public void withdraw(double amount){

		balance = balance - amount;
}

	public void deposit(double amount){

		if(balance >= amount)

		balance = balance+amount;
	}

}
