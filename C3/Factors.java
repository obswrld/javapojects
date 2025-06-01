import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int num = input.nextInt();


		System.out.println("Factor of " + num + " are: ");

		int i = 1; 
		
		while(i <= num) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
	}
}