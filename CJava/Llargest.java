import java.util.Scanner;
public class Llargest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the units: ");
		int num = input.nextInt();

		int count = 0;
		int counter = 1;
		int large = 1;
		

		while (counter <= 10) {
			if (num > large) {
				large = num;
			}
				System.out.println("Enter the units: ");
				num = input.nextInt();
		counter = counter + 1;
		}

			System.out.println("The largest Number is:  " + large);
	}
}