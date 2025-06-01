import java.util.Scanner;
public class Testt1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("First number for sum:  ");
		int compInput1 = (int) ((Math.random() * 100) +1);

		System.out.println("Second number for sum:  ");
		int compInput2 = (int) ((Math.random() * 100) + 1);

		int sum = compInput1 + compInput2;
		
		System.out.println("What is the sum of " + compInput1 + " + " + compInput2);
		int answer = input.nextInt();

		if (answer == sum) {
			System.out.println("True! Your answer is correct.");
		} else {
			System.out.println("False! Your answer is wrong.");
		}
	}
}