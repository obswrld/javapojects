import java.util.Scanner;
	public class Exercise2{
	public static void main(String[] Exercise2){
		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter first Interger: ");
			int x = input.nextInt();

			System.out.print("Enter second Interger: ");
			int y = input.nextInt();

			System.out.print("Enter third Interger: ");
			int z = input.nextInt();

			int result = x * y * z;

			System.out.printf("This product is %d%n", result);
	}
}
			