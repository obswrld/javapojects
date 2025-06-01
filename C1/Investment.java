import java.util.Scanner;
public class Investment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount: ");
		double investment = input.nextDouble();


		System.out.println("Enter annual interest rate: ");
		double annual = input.nextDouble();

		
		System.out.println("Enter number years: ");
		double years = input.nextDouble();

		double monthly = (annual / 100)/ 12;

		double accumulatedValue = investment * Math.pow((1 + monthly), (years * 12)ssss);

		System.out.printf("Accumulated value is %.2f", accumulatedValue); 
}
}