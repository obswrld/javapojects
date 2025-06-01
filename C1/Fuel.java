import java.util.Scanner;
public class Fuel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			System.out.print("Enter distance to drive: ");
			float drive = input.nextFloat();

			System.out.print("Enter fuel efficiency: ");
			float fuel = input.nextFloat();

			System.out.print("Enter price per gallon: ");
			float price = input.nextFloat();


			float costOfDriving = drive * price / fuel;

			System.out.printf("Cost of driving is %.2f", costOfDriving);
	}
}