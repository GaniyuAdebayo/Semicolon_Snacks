import java.security.SecureRandom;
import java.util.Scanner;
public class TaskFour{

	public static void main (){

		SecureRandom randomNumber = new SecureRandom();
		Scanner input = new Scanner (System.in);

		int genRand = 1 + randomNumber.nextInt(10);
		System.out.println("Guess a number from 1 - 10");
		int number = input.nextInt();

		while (genRand != number){

			System.out.println("Guess a number from 1 - 10");
			number = input.nextInt();

			if (number > genRand){
				System.out.println("Too high");
			}
			else if (number < genRand){
				System.out.println("Too low");
			}
	
		}

		System.out.println("Correct");

	}
}