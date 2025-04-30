import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int number = input.nextInt();

		int count = 0;
		int counter = 2;

		while (counter < number) {
			if (number % counter == 0){
				count = count + 1;
			}
		counter = counter + 1;
		}
		if (count > 0) {
			System.out.println(number +" is not a prime number.");
		} else {
			System.out.println(number +" is a prime number.");
		}



	}
}