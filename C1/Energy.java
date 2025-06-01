import java.util.Scanner;
public class Energy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		float water = input.nextFloat();

		System.out.println("Enter the initial temperature: ");
		float temp = input.nextFloat();

		System.out.println("Enter the final temperature: ");
		float temp1 = input.nextFloat();

		float energyNeeded = water * (temp1 - temp) * 4184;

		System.out.printf("Energy needed is %.1f", energyNeeded);
	}
}