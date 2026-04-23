import java.security.SecureRandom;
import java.util.Scanner;
public class TaskFive{

	public static void main (){

		SecureRandom randomNumber = new SecureRandom();
		Scanner input = new Scanner (System.in);

		int genRand = 1 + randomNumber.nextInt(10);
		System.out.println("Guess a number from 1 - 10");
		int number = input.nextInt();
		
		int count = 1;

		while (genRand != number){

			if (number > genRand){
				System.out.println("Too high");
			}
			else if (number < genRand){
				System.out.println("Too low");
			}

			System.out.println("Guess a number from 1 - 10");
			number = input.nextInt();

			count++;
	
		}

		System.out.printf("Correct%nYou guessed right in %d attempts%n", count);

	}
}