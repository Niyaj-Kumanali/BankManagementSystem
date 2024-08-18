package accounts;

public class Account {
	private long accountNo;
	private String accountHolder;
	private double accountBalance;

	public Account(long accountNo, String accountHolder, double accountBalance) {
		this.accountNo = accountNo;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getaccountHolder() {
		return accountHolder;
	}

	public void setaccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
