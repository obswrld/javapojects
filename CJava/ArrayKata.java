public class ArrayKata {
	public static int maximumIn(int[] arrayOfIntegers) {
		int max = arrayOfIntegers[0];

		for (int num : arrayOfIntegers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static int minimumIn(int[] arrayOfIntegers) {
		int min = arrayOfIntegers[0];

		for (int num : arrayOfIntegers) {
			if(num < min) {
				min = num;
			}
		}
		return min;
	}

	public static int sumOf(int[] arrayOfIntegers) {
		int sum = arrayOfIntegers[0];
		
		for(int num : arrayOfIntegers) {
			sum = sum + num;
		}
		return sum;
	}

	public static int sumOfEvenNumber(int[] arrayOfIntegers) {
		int sum = 0;

		for(int num : arrayOfIntegers) {
			if(num % 2 == 0) {
				sum = sum + num;
			}
		}
		return sum;
	}

	public static int sumOfOddNumber(int[] arrayOfIntegers) {
		int sum = 0;

		for (int num : arrayOfIntegers) {
			if(num % 2 != 0) {
				sum = sum + num;
			}
		}
		return sum;
	}

	public static int noOfEvenNumbersIn(int[] arrayOfIntegers) {
		int count = 0;

		for (int num : arrayOfIntegers) {
			if(num % 2 == 0) {
				count ++;
			}
		}
		return count;
	}

	public static int noOfOddNumbersIn(int[] arrayOfIntegers) {
		int count = 0;

		for (int num : arrayOfIntegers) {
			if(num % 2 != 0) {
				count ++;
			}
		}
		return count;
	}	

	public static void evenNumbersIn(int[] arrayOfIntegers) {
		int[] number = arrayOfIntegers;
			for (int counter = 0; counter < arrayOfIntegers.length; counter++) {
				if(arrayOfIntegers[counter] % 2 == 0) {
					System.out.println(arrayOfIntegers[counter] + " ");
				}
			}	
	}

	public static int[] subtractionOfMaxAndMin(int[] arrayOfIntegers) {
			int max = arrayOfIntegers[0];
			int min = arrayOfIntegers[0];

			for (int num : arrayOfIntegers) {
				if(num > max) {
					max = num;
				}
				if(num < min) {
					min = num;
				}
			}

			int[] result = {max - min};

			return result;
			
				
	}

	public static int[] maxMin(int[] arrayOfIntegers) {
		int max = arrayOfIntegers[0];
		int min = arrayOfIntegers[0];

		for(int num : arrayOfIntegers) {
			if(num > max) {
				max = num;
			}
			if(num < max) {
				min = num;
			}
		}
		int[] result = {max, min};
		return result;
	}


	public static int[] sortNumbers(int[] numbers){
		for (int i = 0; i < numbers.length - 1; i++){
			for (int j = 0; j < numbers.length - 1 - i; j++){
				if(numbers[j] > numbers[j + 1]){
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		
			return numbers;
	}


	public 


	










}