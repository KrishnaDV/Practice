package Builder;

//reference - https://dzone.com/articles/design-patterns-the-builder-pattern

public class BankAccount {

	private BankAccount() {

	}

	private long accountNumber;
	private String name;
	private String branch;
	private double balance;
	private double interestRate;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public static class Builder {

		private long accountNumber;
		private String name;
		private String branch;
		private double balance;
		private double interestRate;

		public Builder(long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withBranch(String branch) {
			this.branch = branch;
			return this;
		}

		public Builder withBalance(double balance) {
			this.balance = balance;
			return this;
		}

		public Builder withIntereset(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}

		public BankAccount build() {

			BankAccount acc = new BankAccount();

			acc.accountNumber = this.accountNumber;
			acc.name = this.name;
			acc.branch = this.branch;
			acc.balance = this.balance;
			acc.interestRate = this.interestRate;

			return acc;

		}

	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name
				+ ", branch=" + branch + ", balance=" + balance
				+ ", interestRate=" + interestRate + "]";
	}
}
