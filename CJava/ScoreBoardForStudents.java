public class ScoreBoardForStudents{
	public static void main(String[] args){
		int [][] studentScores = {
			{3, 3, 4},
			{9, 1, 3}
		};

		int [] totals = totalArrayOfScores(studentScores);
		System.out.println("Total Scores:  " + Array.toString(totals));

		double [] averages = averageArrayOfScores(studentScores);
		System.out.println("Average Score:  " + Array.toString(averages));

	}

	public static int[] totalArrayOfScores(int[] arr){
		int[] total = new[arr.length];
		for(int i = 0; i < arr.length; i++){
			total[i] = 0;
			for(int j = 0; j < arr[i].length; j++){
				total[i] += arr[i][j];
			}	
		}
		return total;
	}

	public static double[] averageArrayOfScores(double[] arr){
		double[] average = new[arr.length];

		for (int i = 0; i < arr.length; i++){
			double sum = 0;
			 for (int j = 0; j < arr[i].length; j++) {
                		sum += studentScores[i][j];
         		   }

		average[i] = (double) sum / arr[i].length;
		}
		return average;
	}

}




































