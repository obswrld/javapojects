import java.util.Scanner;
public class Extremes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many Integers do you wish to input:   ");
		int number = input.nextInt();

		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i = 1; i <=number; i++) {
			System.out.println("Enter number:   ");
			int num = input.nextInt();
			
			if (num < smallest) {
				smallest = num;
			}
			if (num > largest) {
				secondLargest = num;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}

		}
		int sum = largest + secondLargest;
		System.out.println("The largest number is  " + largest + " The smallest number is  " + smallest + " The sume of the extreme numbers are  " + sum);
	}
}