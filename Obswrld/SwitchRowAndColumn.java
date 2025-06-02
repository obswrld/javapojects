public class SwitchRowAndColumn{
	public static int[][] switchRowAndColumn(int[][] numbers){
		int rows = numbers.length;
		int col = numbers[0].length;

		int[][] switchedNumbers = new int[rows][col];

		for (int i = 0; i < rows; i++){
			for(int j = 0; j < col; j++){
				switchedNumbers[j][i] = numbers[i][j];
			}
		}
	return switchedNumbers;
	}

	public static void main(String[] args){
		int[][] switchNum = {
						{3,4,2},
						{5,6,7},
						{9,7,6}
						};

		int[][] switchNumber = switchRowAndColumn(switchNum);
		
		for (int i = 0; i < switchNumber.length; i++){
			for(int j = 0; j < switchNumber.length; j++){
				System.out.print(switchNumber[i][j] + "");
			}
			System.out.println();
		}
	}
}