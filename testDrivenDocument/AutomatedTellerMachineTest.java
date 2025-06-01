import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AutomatedTellerMachineTest{
	
	@BeforeEach
		public void setUp(){
			System.out.print("Can Work");
	}

	@Test
	public void testCanWithdrawFunds(){
			Account johnsAccount = new Account("John", "0123456789", 50.00);
			Account jamesAccount = new Account("James", "9876543210", 50000.00);
			Account bolajiAccount = new Account("Bolaji", "9876543210", 500.00);

			Account[] accounts = {johnsAccount,  jamesAccount,  bolajiAccount};
			AutomatedTellerMachine atm = new AutomatedTellerMachine();
			atm.setAccounts(accounts);
		
			atm.withdraw(jamesAccount.getAccountNumber(), 20000);
			assertEquals(30000, jamesAccount.getBalance());
	
	}


	@Test 
	public void testWithdrawNegativeAmountThrowsException() {
		atm.withdraw(accounts[1].getAccountNumber(), -30_000);
	}
	




}