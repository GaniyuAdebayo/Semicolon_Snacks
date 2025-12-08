import java.util.Scanner;

public class TaskSix{

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

		System.out.printf("The average of the even scores is %.2f%n", evenAverage);
			

	}



}