package transactions;

import accounts.Account;

public class FundTransfer {
	
	public boolean transfer(Account fromAccount, Account toAccount, double amount) {
		if(fromAccount.getAccountBalance() > amount) {
			double accountBalance = fromAccount.getAccountBalance() - amount;
			fromAccount.setAccountBalance(accountBalance);
			toAccount.setAccountBalance(toAccount.getAccountBalance()+amount);
			return true;
		}
		return false;
	}

}
