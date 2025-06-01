import java.util.Scanner;
public class LargeSmallAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the First Integer: ");
		int num1 = input.nextInt();

		System.out.println("Enter the Second Integer: ");
		int num2 = input.nextInt();

		System.out.println("Enter the Third Integer: ");
		int num3 = input.nextInt();
		
		System.out.println("Enter the Fourth Integer: ");
		int num4 = input.nextInt();
	
		System.out.println("Enter the Fifth Integer: ");
		int num5 = input.nextInt();

		int largest = num1;
		int smallest = num2;

		if (num2 > largest) largest = num2;
		if (num3 > largest) largest = num3;
		if (num4 > largest) largest = num4;
		if (num5 > largest) largest = num5;
		
		if (num2 < smallest) smallest = num2;
		if (num3 < smallest) smallest = num3;
		if (num4 < smallest) smallest = num4;
		if (num5 < smallest) smallest = num5;

		System.out.printf("Largest: %d%n",  largest);
		System.out.printf("Smallest: %d%n", smallest);

		int even = 0;
		
		if (num1 % 2 == 0) even += num1;
		if (num2 % 2 == 0) even += num2;
		if (num3 % 2 == 0) even += num3;
		if (num4 % 2 == 0) even += num4;
		if (num5 % 2 == 0) even += num5;
		
		

		System.out.printf("Average of even numbers is:  %d%n ", even / 5);

		
	}
}