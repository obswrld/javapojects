import java.util.Scanner;
public class TablePower {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Integer: ");
		int number = input.nextInt();

		System.out.println("Multiplication Table for "+ number +"is: ");

		int counter = 1;

		while (counter <= 12) {
			int result = number * counter;
			System.out.println(number +"*"+ counter + "=" + result);
			counter = counter + 1;
		}
	
		
		






















	}


}