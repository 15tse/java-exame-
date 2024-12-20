package encapsulatio;


	

	public class banckaccount {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000.0);
	        account.deposit(500.0);
	        account.withdraw(200.0);
	        System.out.println("Current balance: " + account.getBalance());
	    }
	    public class BankAccount {
		    private double balance; // Encapsulated data

		    public BankAccount(double initialBalance) {
		        balance = initialBalance;
		    }

		    public void deposit(double amount) {
		        balance += amount;
		    }

		    public void withdraw(double amount) {
		        balance -= amount;
		    }

		    public double getBalance() {
		        return balance;
		    }
		}
	}

