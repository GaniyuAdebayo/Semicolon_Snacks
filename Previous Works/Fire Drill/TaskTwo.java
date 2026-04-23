import java.util.Scanner;

public class TaskTwo{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		double sum = 0.0;

		for (int counter = 1; counter <= 10; ++counter){

			System.out.printf("Enter score %d:%n", counter);

			double score = input.nextDouble();

			sum += score;

		}

		double average = sum/10;

		System.out.printf("The average of the ten scores is %.2f%n", average);
		
			

	}



}