import java.util.Scanner;

public class TaskThree{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		double sum = 0.0;

		for (int counter = 1; counter <= 10; ++counter){

			System.out.printf("Enter score %d:%n", counter);

			double score = input.nextDouble();

			sum += score;

		}

		double average = sum/10;

		System.out.printf("The sum and average of the ten scores are %.2f and %.2f respectively%n", sum, average);
		
			

	}



}