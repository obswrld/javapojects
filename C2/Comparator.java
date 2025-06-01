import java.util.Scanner;
public class Comparator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

				
		while (true) {
			System.out.println("Enter your first Integer:  ");
			int num1 = input.nextInt();

			System.out.println("Enter your first Integer:  ");
			int num2 = input.nextInt();

			if (num1 == num2) {
				System.out.println("0");
			}
			if (num1 > num2) {
				System.out.println("1");
			}
			if (num1 < num2) {
				System.out.println("-1");
			}


			System.out.println("Do you wish to continue or stop. if yes click 1 if no click 0. ");
			int otp = input.nextInt();

			if (otp == 1) {
				System.out.println("Exiting....");
				break;
			}

			if (otp == 0) {
				continue;
			}

		}
}
}