import java.util.Arrays;
public class ScoreBoardForStudents{
	public static void main(String[] args){
		int [][] studentScores = {
			{3, 3, 4},
			{9, 1, 3}
		};

		int [] total = totalArrayOfScores(studentScores);
		System.out.println("Total Scores:  " + Arrays.toString(total));

		double [] averages = averageArrayOfScores(studentScores);
		System.out.println("Average Score:  " + Arrays.toString(averages));

		int [] position = checkPosition(total);
		System.out.println("Position:  " + Arrays.toString(position));

	}

	public static int[] totalArrayOfScores(int[][] arr){
		int[] total = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			total[i] = 0;
			for(int j = 0; j < arr[i].length; j++){
				total[i] += arr[i][j];
			}	
		}
		return total;
	}

	public static double[] averageArrayOfScores(int[][] arr){
		double[] average = new double[arr.length];

		for (int i = 0; i < arr.length; i++){
			int sum = 0;
			 for (int j = 0; j < arr[i].length; j++) {
                		sum += arr[i][j];
         		   }

		average[i] = (double) sum / arr[i].length;
		}
		return average;
	}

	public static int[] checkPosition(int[] total){
		int [] ranks = new int[total.length];
		for (int i = 0; i < total.length; i++) {
			int rank = 1;
			for (int j = 0; j < total.length; j++){
				if (total[j] > total[i]){
					rank++;
				}
			}
			ranks[i] = rank;
		}
		return ranks;
	}

}


