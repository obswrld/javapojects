import java.util.Scanner;
public class SumIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your First Integer:  ");
		int target = input.nextInt();
		
		int sum = 0;
		
		while (sum <= target) {
			System.out.println("Enter your Integer:  ");
			int num = input.nextInt();
			sum += num;

			if (sum >= target) {
				System.out.println("Sum of Integers:  " + sum);
				break;
			} 
			
			if (sum < num) {
				continue;
			}
		}
	}
}