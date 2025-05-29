import java.util.Arrays;
public class IndexArray{
	public static int[][] IndexNumber(int[][] numbers){
		int number = numbers;

		for (int row : number){
			for(int num : row){
				System.out.println(num + "  ");
			}
		System.out.println();
		}
	return numbers;
	}

	public static void main(String[] args){
		int[][] input = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			};
		Sytem.out.println(Arrays.deepToIndexNumber(input));
	}
}