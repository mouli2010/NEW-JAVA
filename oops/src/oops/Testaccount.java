package oops;

public class Testaccount {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.insert(8323456, "rajamouli",1000);
		a1.display();
		a1.chekBalance();
		a1.deposit(40000);
		a1.chekBalance();
		a1.withdraw(1500);
		a1.chekBalance();

	}

}
