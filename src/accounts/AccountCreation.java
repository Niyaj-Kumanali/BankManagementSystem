package accounts;

public class AccountCreation {

	public Account createAccount(long accountNo, String accountHolder, double accountBalance) {
		return new Account(accountNo, accountHolder, accountBalance);
	}

}
