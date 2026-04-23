import java.util.Scanner;

public class TaskFive{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		double sumEven = 0.0;
		double sum = 0.0;
		

		for (int counter = 1; counter <= 10; ++counter){

			System.out.printf("Enter score %d:%n", counter);

			double score = input.nextDouble();
			
			if (score % 2 == 0){
				sumEven += score;
			}
			

			sum += score;

		}

		System.out.printf("The sum of the even scores is %.2f%n", sumEven);
			

	}



}