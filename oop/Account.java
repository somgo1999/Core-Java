package core.java.oop;

public class Account {
	private String number;
	private String accountType;
	private double balance;

	public void setNumber(String number) {
		this.number = number;
	}

	public String getnumber() {
		return number;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public double deposit(double amount) {
		double bal = (getBalance() + amount);
		System.out.println("Balance after Deposit" + amount);
		return bal;
	}

	public double withdrawal(double amount) {
		double bal = (getBalance() - amount);
		System.out.println("Balance after Withdrawal" + amount);
		return bal;
	}

	public double fundTransfer(double amount) {
		double bal = (getBalance() - amount);
		System.out.println("Balnce after Fund Transfer" + amount);
		return bal;
	}

	public double payBill(double amount) {
		double bal = (getBalance() + amount);
		System.out.println("Balance after Bill Pay" + amount);
		return bal;
	}
}
