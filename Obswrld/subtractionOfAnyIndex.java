import java.util.Scanner;
public class subtractionOfAnyIndex{
	public static int subOfAnyIndex(int[] numbers, int index1, int index2){
		return numbers[index1] - numbers[index2];
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number you want");
		int num = input.nextInt();
	
		int[] numbers = new int[num];

		System.out.println("Enter the " + num + " numbers you selected:   ");
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
		
		System.out.print("Enter the first Index of your choice to subtract:  ");
		int index1 = input.nextInt();
		while(index1 < 0 || index1 > numbers.length){
			if (index1 > numbers.length){
				System.out.println("Please within the index");
				System.out.print("Enter the first Index of your choice to subtract:  ");
				index1 = input.nextInt();
			}
		}

		System.out.print("Enter the second Index of your choice to subtract:  ");
		int index2 = input.nextInt();
		while(index2 < 0 || index2 > numbers.length){
			if (index2 > numbers.length){
				System.out.println("Please within the index");	
				System.out.print("Enter the second Index of your choice to subtract:  ");
				index2 = input.nextInt();
			}
		}
		System.out.println( subOfAnyIndex(numbers, index1, index2));
	}
}