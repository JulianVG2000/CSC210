// Name: Julian van Geest
// Date: 11/11/2021
// Project Description: The purpose of this program is to create an account object with an id 
//    of 1152, a balance of $50,000, an interest rate of 5.5%, withdraw $1500 from the
//    balance, deposit $2000 into the balance, and display the balance, monthly interest, and
//    date of when the account was created.
// Input: id, balance, annualInterestRate, withdraw, deposit
// Output: balance, monthlyInterestRate, date
// Comments:

package myCLUHW8;

public class Account {

	public static void main(String[] args) {
		Account account = new Account();
		account.setId(1152);
		account.setBalance(50000.0);
		account.setAnnualInterestRate(0.055);
		account.withdraw(1500.0);
		account.deposit(2000.0);
		System.out.printf("%-20s%-20s%-20s\n", "balance", "monthly interest", "date");
		System.out.printf("%-20f%-20f%-20s", account.getBalance(), account.getMonthlyInterestRate(), account.getDateCreated());

	}
	
	private int id;
	private double balance;
	private double annualInterestRate;
	java.util.Date date = new java.util.Date();
	private String dateCreated;
	Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated = date.toString();
	}
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	int getId() {
		return id;
	}
	double getBalance() {
		return balance;
	}
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	void setId(int newId) {
		id = newId;
	}
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	String getDateCreated() {
		return dateCreated;
	}
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	void withdraw(double withdraw) {
		balance = balance - withdraw;
	}
	void deposit(double deposit) {
		balance = balance + deposit;
	}

}
