package core.java.oop;

public class TestAccount {
	public static void main(String[] agrs) {
		Account a = new Account();
		a.setNumber("123");
		a.setAccountType("Saving Account");
		a.setBalance(100000);
		System.out.println(a.getAccountType());
		System.out.println(a.getnumber());
		System.out.println(a.getBalance());
		System.out.println(a.deposit(100000));
		System.out.println(a.withdrawal(1000));
		System.out.println(a.payBill(1000));
		System.out.println(a.fundTransfer(1000));
	}
}
