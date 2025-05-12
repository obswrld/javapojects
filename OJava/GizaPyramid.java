import java.util.Scanner;
public class GizaPyramid {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		System.out.println("Calculation of Statistics of Giz Pyramid: ");

		System.out.print("Estimated Number of Stones: ");
		double totalWeight = input.nextDouble();
		double averageStones = input.nextDouble();

		double numberStones = totalWeight / averageStones;

		System.out.print("Average weight of Stone: ");
		double totalWeightStones = input.nextDouble();
		double numStones = input.nextDouble();

		double weightOfStone = (totalWeightStones * 1000) / numStones;

		System.out.printf("Estimated number of stone is %d%n " , numberStones);
		System.out.printf("Average Weight of stone is %d%n " , weightOfStone);

		
	} 
}