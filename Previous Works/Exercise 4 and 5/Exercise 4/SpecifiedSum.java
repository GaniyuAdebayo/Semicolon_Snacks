import java.util.Scanner;
public class SpecifiedSum{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter the minimum target sum: ");
		double targetSum = input.nextDouble();

		double sum = 0;

		while (sum < targetSum){

			System.out.println("Enter a number: ");
			double number = input.nextDouble();

			sum += number;


		}

		System.out.printf("Current sum of %.2f is greater than or equal to target sum of %.2f%n", sum, targetSum);
	}
}