public class ScoreBoardForStudents{
	/*public static int[] scoreBoardTotal(int[] arr){
		int total = arr[o];
		for (int num : arr){
			total = total + num;
		}
		return total;
	}

	public static int[] scoreBoardAverage(int[] arr){
		int average = arr[0];
		int total = arr[0];
		int sum = arr[0];
		for (int num : arr){
		average = sum / total;
		}
		return average;
	}*/

	public static void main(String[] args){
		double [][] studentScores = {
			{3, 3, 4},
			{9, 1, 3}
		};

		int numberOfStudents = studentScores.length;

		for (int i = 0; i < numberOfStudents; i++ ){
			double sum = 0;
            		int numberOfScores = studentScores[i].length;

			 for (int j = 0; j < numberOfScores; j++) {
                		sum += studentScores[i][j];
         		   }
		double average = sum / numberOfScores;
		System.out.println(sum);
		System.out.println(average);
		}
	}

}




































