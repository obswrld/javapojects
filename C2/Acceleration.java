import java.util.Scanner;
public class Acceleration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter starting velocity: ");
		float velocity0 = input.nextFloat();

		System.out.println("Enter ending velocity: ");
		float velocity1 = input.nextFloat();

		System.out.println("Enter time span:");
		float time = input.nextFloat();

		float acceleration = (velocity1 - velocity0) / time;

		System.out.printf("Average acceleration is %.4f ", acceleration);
	}

}


