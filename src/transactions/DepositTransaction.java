package transactions;

import accounts.Account;

public class DepositTransaction {
	public void deposit(Account account, double amount) {
		double accountBalance = account.getAccountBalance() + amount;
		account.setAccountBalance(accountBalance);
	}
}
