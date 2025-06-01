public class AutomatedTellerMachine{
		private Account[] accounts;
		public void setAccounts(Account[] accounts) {
			this.accounts = accounts;
		}

		public void withdraw(String accountNumber, double amount){

		//1.  look for account with given accountNumber
			for(int index = 0; index < accounts.length; index++){

				Account foundAccount = accounts[index];
				String foundAccountNumber = foundAccount.getAccountNumber();

		//2a, if account is found, subtract given amount from account balance
				if (foundAccountNumber==accountNumber) {
					foundAccount.withdraw(amount);
				}
			}
		//2b. if account is not found, report error to user;


}
}