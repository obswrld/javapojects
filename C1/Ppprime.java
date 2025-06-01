import java.util.Scanner;
public class Ppprime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an Integer: ");
		int number = input.nextInt();
		int flag = 0;

		if (number == 0 && number == 1) {
			System.out.println("This not a prime number. ");
		} else {
			int middleNumber = number / 2;
			for (int i = 2; i <= middleNumber; i++) {
				if (number % i == 0) {
					System.out.println(number + "is not a prime number.");
					flag = 1;
				break;
				}
			}
			if (flag == 0) {
				System.out.println(number +" is a prime number.");
			}
		}
	}

}