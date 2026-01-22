import java.security.SecureRandom;
import java.util.Scanner;
public class TaskSeven{

	public static void main (){

		SecureRandom randomNumber = new SecureRandom();
		Scanner input = new Scanner (System.in);
		
		int [] guesses = new int[10];

		int genRand = 1 + randomNumber.nextInt(10);
		System.out.println("Guess a number from 1 - 10");
		int number = input.nextInt();
		
		int count = 1;
		guesses[count - 1] = number;

		while (genRand != number && count < 10){
			count++;
			System.out.println("Guess a number from 1 - 10");
			number = input.nextInt();
			guesses[count - 1] = number;

			if (number > genRand){
				System.out.println("Too high");
			}
			else if (number < genRand){
				System.out.println("Too low");
			}
	
		}

		if (number == genRand && count < 10){
			System.out.printf("You won in %d attempts%n", count);
		}
		if (count == 10){
			System.out.println("Game Over");
		}

	}
}