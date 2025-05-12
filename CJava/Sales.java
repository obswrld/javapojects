import java.util.Scanner;
public class Sales {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println("Enter Item Sold between 1 and 4: ");
	int item = input.nextInt();


	double salesEarning = 200;
	double bonus = 0.09;
	int counter = 2;
	double value1 = 239.99;
	double value2 = 129.75;
	double value3 = 99.95;
	double value4 = 350.89;
	double total1 = (double) salesEarning + value1;
	double total2 = (double) salesEarning + value2;
	double total3 = (double) salesEarning + value3;
	double total4 = (double) salesEarning + value4;

	while (counter <= 4) {
		if (counter == 1) {
			total1 = (double) salesEarning + value1;
		}
		else if (counter == 2) {
			total2 = (double) salesEarning + value2;
		}
		else if (counter == 3) {
			total3 = (double) salesEarning + value3;
		}
		else {
			if (counter == 4) {
				total4 = (double) salesEarning + value4;
			}
		}
		counter = counter + 1;
	
		System.out.println("Enter Item between 1 and 4: ");
		item = input.nextInt();
			
	
	} 

		System.out.printf("%nThe Sales Earning for 1 item: %.2f  ", total1);
		System.out.printf("%nThe Sales Earning for 2 item: %.2f  " , total2);
		System.out.printf("%nThe Sales Earning for 3 item: %.2f  ", total3);
		System.out.printf("%nThe Sales Earning for 4 item: %.2f  ", total4);

		
	}
}