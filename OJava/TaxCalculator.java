import java.util.Scanner;
public class TaxCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Salary Earned:  ");
		long earn = input.nextLong();
		double rate1 = 0.15;
		double rate2 = 0.20;
		double tax1 = (double) earn * rate1;
		double tax2 = (double) earn * rate2; 
		long taxRate = 30000;

		for (int i = 1; i <= 3; i++) {
			if (earn == taxRate) {
				tax1 = earn * rate1;
				System.out.printf("The tax collected is %.2f:  ", tax1);
			} else {
				if (earn != 30000) {
					tax2 = earn * rate2;
					System.out.printf("The tax collected is %.2f:  ", tax2);
				}
			}
		}
	}
}