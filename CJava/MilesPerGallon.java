import java.util.Scanner;
public class MilesPerGallon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		double totalMpg = 0;
		int tripCounter = 0;

		System.out.println("Enter Miles covered or Enter -1 to Stop: ");
		int miles = input.nextInt();


		while (miles != -1) {

			System.out.println("Enter Number of Gallon used or Enter -1 to stop: ");
			int gallon = input.nextInt();

			if (gallon != 0){
			double mpg = (double) miles / gallon;
			System.out.printf("the miles per gallon is:   %.2f", mpg);
			totalMpg = totalMpg + mpg;
			tripCounter = tripCounter + 1;
			} else {
				System.out.println("Gallon cant be 0 or less than 0.");
			}
			System.out.println("Enter Miles covered or Enter -1 to stop: ");
			miles = input.nextInt();

		}

			if (tripCounter > 0){
				double average = (double) totalMpg / tripCounter;
				System.out.printf("the average of number of gallons used and miles covered is: %.2f",  average);
			} else {
				System.out.print("No info entered.");
			}
	}
}