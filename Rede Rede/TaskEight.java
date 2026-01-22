import java.security.SecureRandom;
import java.util.Scanner;
public class TaskEight{

	public static void main (){

		SecureRandom randomNumber = new SecureRandom();
		Scanner input = new Scanner (System.in);
		
		int [] guesses = new int[10];

		int genRand = 1 + randomNumber.nextInt(10);
		System.out.println("Guess a number from 1 - 10");
		int number = input.nextInt();
		
		int count = 1;
		guesses[count - 1] = number;

		while (genRand != number && count <= 10){
			
			if (number > genRand){
				System.out.println("Too high");
			}
			else if (number < genRand){
				System.out.println("Too low");
			}
			count++;
			System.out.println("Guess a number from 1 - 10");
			number = input.nextInt();
			guesses[count - 1] = number;
	
		}

		if (number == genRand && count <= 10){
			System.out.printf("You won in %d attempts%n", count);
		}
		if (count > 10){
			System.out.println("Game Over");
		}

		int largest = guesses[0];
		for (int counter = 1; counter < count; counter++){
			if (guesses[counter] > largest)
				largest = guesses[counter];
		}
		int smallest = guesses[0];
		for (int counter = 1; counter < count; counter++){
			if (guesses[counter] < smallest)
				smallest = guesses[counter];
		}
		int sum = 0;
		for (int val : guesses){
			sum += val;
		}
		double average = (double) sum/count;

		System.out.printf("Smallest: %d%nLargest: %d%nSum: %d%nAverage: %.2f", smallest, largest, sum, average);

	}
}