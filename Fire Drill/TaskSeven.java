import java.util.Scanner;

public class TaskSeven{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		double sumEven = 0.0;
		double sum = 0.0;
		int evenCounter = 0;
		

		for (int counter = 1; counter <= 10; ++counter){

			System.out.printf("Enter score %d:%n", counter);

			double score = input.nextDouble();
			
			if (score % 2 == 0){
				sumEven += score;
				evenCounter += 1;
			}
			

			sum += score;

		}

		double evenAverage = sumEven/evenCounter;

		System.out.printf("The sum and average of the even scores are %.2f and %.2f respectively%n", sumEven, evenAverage);
			

	}



}