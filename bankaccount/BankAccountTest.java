package bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(5000000, 100000);
		//BankAccount ba2 = new BankAccount(5000000, 150000);
		//BankAccount ba3 = new BankAccount(5000000, 150000);
		ba1.addCC(1000000);
		ba1.addCA(1000000);
		ba1.rCC(7000000);
		ba1.rCA(1000000);
		ba1.sCuenta();
	}

}
