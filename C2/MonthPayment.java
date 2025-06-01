import java.util.Scanner;
public class MonthPayment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the principal amount:  ");
		double principal = input.nextDouble();

		System.out.println("Enter the annual interest rate:  ");
		double rate = input.nextDouble();

		System.out.println("Enter the duration of the loan:  ");
		double durationInYears = input.nextDouble();
		
		// calculation for the monthly interest rate 
		double monthlyInterestRate = rate / 100 / 12;
		
		// calculation of the number of months 
		int numberOfMonths = (int) durationInYears * 12;

		double monthlyPayments = (principal * monthlyInterestRate) / 
								(1 - Math.pow(1 + monthlyInterestRate,  -numberOfMonths));

		System.out.printf("Your Monthly Payment is:  %.2f\n", monthlyPayments);
	}
}