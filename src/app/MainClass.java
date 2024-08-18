package app;

import accounts.*;
import transactions.*;

public class MainClass {

	public static void main(String[] args) {
		AccountCreation ac1 = new AccountCreation();
		Account account1 = ac1.createAccount(12345, "Niyaj Kumanali", 4000000);
		Account account2 = ac1.createAccount(67890, "Pattu Pol", 1000000);

		DepositTransaction d1 = new DepositTransaction();
		FundTransfer t1 = new FundTransfer();
		ViewAccountBalance v1 = new ViewAccountBalance();
		WithdrawTransaction w1 = new WithdrawTransaction();

		d1.deposit(account1, 500000);
		w1.withdraw(account1, 50000);
		t1.transfer(account1, account2, 1000000);
		v1.viewBalance(account1);
		v1.viewBalance(account2);
	}
}
