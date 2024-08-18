package transactions;

import accounts.Account;

public class ViewAccountBalance {
	public void viewBalance(Account account) {
		System.out.println("Account Balance of "+account.getaccountHolder()+" is "+account.getAccountBalance());
	}
}
