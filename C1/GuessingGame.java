import java.util.Scanner;
public class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("The Mystery Game Where you have 3 Trials.");
		int comp = (int)((Math.random() * 10) + 1);
		System.out.printf("%d", comp);
		
		

		System.out.println("Guess Your first Score!: ");
		int score1 = input.nextInt();
		if (score1 != 0 && score1 != 1 && score1 != 2 && score1 != 3 && score1 !=4 && score1 != 5 && score1 !=6 && score1 != 7 && score1 != 8 && score1 != 9 && score1 != 10) {
			System.out.println("Please Enter a Valid Score!");
		} else {
			if (score1 == 0 && comp == 0) {
				System.out.println("You are correct!");
			}
			else { if (score1 == 1 && comp == 1) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 2 && comp == 2) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 3 && comp == 3) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 4 && comp == 4) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 5 && comp == 5) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 6 && comp == 6) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 7 && comp == 7) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 8 && comp == 8) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 8 && comp == 8) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 9 && comp == 9) {
			System.out.println("You are correct!");
			}
			else { if (score1 == 10 && comp == 10) {
			System.out.println("You are correct!");
			} else {
				System.out.println("Guess Your Second Score!:");
				int score2 = input.nextInt();
				if (score2 != 0 && score2 != 1 && score2 != 2 && score2 != 3 && score2 !=4 && score2 != 5 && score2 !=6 && score2 != 7 && score2 != 8 && score2 != 9 && score2 != 10) {
					System.out.println("Please Enter a Valid Score!");
				} else {
					if (score2 == 0 && comp == 0) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 1 && comp == 1) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 2 && comp == 2) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 3 && comp == 3) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 4 && comp == 4) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 5 && comp == 5) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 6 && comp == 6) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 7 && comp == 7) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 8 && comp == 8) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 9 && comp == 9) {
					System.out.println("You are correct!");
					}
					else { if (score2 == 10 && comp == 10) {
					System.out.println("You are correct!");
					} else {
						System.out.println("Enter your Third and Final Trial!");
						int score3 = input.nextInt();
						if (score3 != 0 && score3 != 1 && score3 != 2 && score3 != 3 && score3 !=4 && score3 != 5 && score3 !=6 && score3 != 7 && score3 != 8 && score3 != 9 && score3 != 10) {
							System.out.println("Please Enter a Valid Number!");
						} else {
							if (score2 == 0 && comp == 0) {
							System.out.println("You are correct!");
							}
							esle { if (score2 == 1 && comp == 1) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 2 && comp == 2) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 3 && comp == 3) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 4 && comp == 4) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 5 && comp == 5) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 6 && comp == 6) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 7 && comp == 7) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 8 && comp == 8) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 8 && comp == 8) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 9 && comp == 9) {
							System.out.println("You are correct!");
							}
							else { if (score2 == 10 && comp == 10) {
							System.out.println("You are correct!");
							} else {
								System.out.println("I'm sorry you failed.");
							}
						}}}}}}}}}}}}
						}}}}}}}}}}}}
						}}}}}}}}}}}}
						
					}
				}
			}
		}
	}
} 	