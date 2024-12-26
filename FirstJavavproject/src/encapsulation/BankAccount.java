package encapsulation;


	public class BankAccount {
		  private String accountNumber;
		  private double balance;

		  // Constructor with account number and initial balance
		  public BankAccount(String accountNumber, double initialBalance) {
		    this.accountNumber = accountNumber;
		    this.balance = initialBalance;
		  }

		  // Constructor with only account number (initial balance = 0)
		  public BankAccount(String accountNumber) {
		    this(accountNumber, 0.0);
		  }

		  // Getter for account number
		  public String getAccountNumber() {
		    return accountNumber;
		  }
		  // Getter for balance
		  public double getBalance() {
		    return balance;
		  }

		  // Method to deposit funds
		  public void deposit(double amount) {
		    if (amount > 0) {
		      balance += amount;
		    } else {
		      System.out.println("Invalid deposit amount.");
		    }
		  }
		  // Method to withdraw funds
		  public void withdraw(double amount) {
		    if (amount > 0 && amount <= balance) {
		      balance -= amount;
		    } else {
		      System.out.println("Invalid withdrawal amount.");
		    }
		  }
		    BankAccount account = new BankAccount("1234567890", 1000.0);
		    System.out.println("Account Number: " + account.getAccountNumber());
		    System.out.println("Initial Balance: " + account.getBalance());

		    account.deposit(500.0);
		    System.out.println("Balance after deposit: " + account.getBalance());

		  



}
