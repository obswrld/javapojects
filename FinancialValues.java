//import the scanner system
import java.util.Scanner;

//declaring the class value
public class FinancialValues {

	//decalring the main method 
	public static void main(String[] args) {
		
		//setting the scanner inputs in the system
		Scanner input = new Scanner(System.in);

		

		System.out.print("Enter Exchange Rate: ");
		double rate = input.nextDouble();
		if (rate <= 0 && rate == -0) {
			System.out.println("Invalid Rate.");
		} else {
			System.out.print("Enter 0 to convert dollars to rmb or convert 1 to convert rmb to dollars:  ");
			double select = input.nextDouble();
			if (select != 0 && select != 1) {
				System.out.print("Invalid input.");
			} else  {
				if (select == 0) {
				System.out.print("Enter dollars amount: ");
				double dollars = input.nextDouble();
				if (dollars <= 0 && dollars == -0){
					System.out.print("Please Input a Positive Number.");
				} else {
						double convertDollar = dollars * rate;
						System.out.printf("$%.2f yaun is %.2f USD ", dollars, convertDollar);
					}
				} 

				if (select == 1) {
				System.out.print("Enter rmb amount: ");
				double rmb = input.nextDouble();
				if (rmb <= 0 && rmb == -0) {
					System.out.print("Please Input a Negative Number.");
				} else {
					double convertRmb = rmb / rate;
					System.out.printf("$%.2f USD is %.2f yaun ", rmb, convertRmb);
				}
				}
				
				}

				
			}
		}
		
}