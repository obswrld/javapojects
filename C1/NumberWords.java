import java.util.Scanner;
public class NumberWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Kindly Enter an Integer: ");
		int num = input.nextInt();

		if (num != 0 && num != 1 && num != 2 && num != 3 && num !=4 && num != 5 && num !=6 && num != 7 && num != 8 && num != 9 && num != 10) {
			System.out.println("Invalid Number, Please Input The Required Number.");
		} else {
			if (num == 0) {
				System.out.println("Zero!");
			}
			if (num == 1) {
				System.out.println("One!");
			}
			if (num == 2) {
				System.out.println("Two!");
			}
			if (num == 3) {
				System.out.println("Three!");
			}
			if (num == 4) {
				System.out.println("Four!");
			}
			if (num == 5) {
				System.out.println("Five!");
			}
			if (num == 6) {
				System.out.println("Six!");
			}
			if (num == 7) {
				System.out.println("Seven!");
			}
			if (num == 8) {
				System.out.println("Eight!");
			} 
			if (num == 9) {
				System.out.println("Nine!");
			}
			if (num == 10) {
				System.out.println("Ten!");
			}
		}
	}
}