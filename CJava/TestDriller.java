import java.util.Scanner;
public class TestDriller {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many copies are you purchasing please:  ");
		int copy = input.nextInt();

		int result = Kata.CopiesDriller(copy);

		System.out.println("Your Fee will be a total of #" + result);
	}
}