import java.util.Scanner;
public class evenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			System.out.print("Enter 3 Integers: ");

			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();

			int even = 0;
			int odd = 0;

			
			if(a % 2 == 0 ) 
			even = even + a;

			if (b % 2 == 0)
			even = even + b;

			if (c % 2 == 0)
			even = even + c;

			System.out.printf("sum of even numbers is %d%n ",  even);


			if (a % 2 != 0)
			odd = odd + a;

			if (b % 2 != 0)
			odd = odd + b;

			if (c % 2 != 0)
			odd = odd + c;

			System.out.printf("sum of odd numbers is %d%n",  odd);
			

	
	}
}