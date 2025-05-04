import java.util.Scanner;
public class Fuels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your Bugdet for the fuel please:  ");
		int bugdet = input.nextInt();
		
		int price = 855;
		double liters = (double) bugdet /  price;
		
		System.out.printf("The liter is: %.2f  ",  liters); 
	}
}