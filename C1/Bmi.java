import java.util.Scanner;
public class Bmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weights in pounds: ");
		double a = input.nextDouble();
		
		System.out.println("Enter heights in inches: ");
		double b = input.nextDouble();

		double xkg = a * 0.45359237;
		double ym = b * 0.0254;
            double m = ym*ym;

		double bmi = xkg / m;

		System.out.printf("Bmi is %f", bmi); 
	}
}