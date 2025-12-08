import java.util.Scanner;

public class TaskOne{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		double sum = 0.0;

		for (int counter = 1; counter <= 10; ++counter){

			System.out.printf("Enter score %d:%n", counter);

			double score = input.nextDouble();

			sum += score;

		}

		System.out.printf("The sum of the ten scores is %.2f%n", sum);
			

	}



}