import java.util.Scanner;
public class Aarray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements:  ");
		int num = input.nextInt();

		int [] numbers = new int[num];

		System.out.println("Enter " + num + " of Integers ");
			for (int i = 0; i < num; i++){
				numbers[i] = input.nextInt();
			}

		int count = ArrayFunctions. evenNumbersIn(numbers);
		System.out.println("The number of odd number is:  " + count);

	}
}