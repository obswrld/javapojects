import java.util.Scanner;
public class Multiply2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First number for multiplication Table");
		int number = input.nextInt();

		System.out.println("Enter the next number for multiplication Table");
		int multiply = input.nextInt();

		Kata.MultiplicationTable(number, multiply);

		


		
	}
}