import java.util.Scanner;
public class GamesGroup {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int nums = input.nextInt();
		int binary = 0;
		int binary1 = 0;

		while (num >= 0) {
			
			binary = num % 10;
			binary1 = nums % 10;
			System.out.printf("%d", binary);
			System.out.printf("%d", binary1);
			num = num / 2;

			if (num == 0) {
				break;
			}
		}
			
		
	}
}