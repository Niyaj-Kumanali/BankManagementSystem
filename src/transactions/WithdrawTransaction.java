package transactions;

import accounts.Account;

public class WithdrawTransaction {
	
	public boolean withdraw(Account account, double amount) {
		
		if(account.getAccountBalance() > amount) {
			double accountBalance = account.getAccountBalance() - amount;
			account.setAccountBalance(accountBalance);
			return true;
		}
		return false;
	}

}
