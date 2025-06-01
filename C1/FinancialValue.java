//import the scanner system
import java.util.Scanner;

//declaring the class value
public class FinancialValue {

	//decalring the main method 
	public static void main(String[] args) {
		
		//setting the scanner inputs in the system
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Exchange rate: ");
		double rateChange = input.nextDouble();
		if (rateChange < 0 ) {
			System.out.println("Invalid");
		} else {
			System.out.print("Enter amount: ");
			double amount = input.nextDouble();
			if (amount < 0 ) {
				System.out.println("Invalid Amount")
			} else {
				System.out.print();
			}
		}
	}
}