import java.security.SecureRandom;
import java.util.Scanner;
public class TaskTwo{

	public static void main (){

		SecureRandom randomNumber = new SecureRandom();
		Scanner input = new Scanner (System.in);

		int genRand = 1 + randomNumber.nextInt(10);

		System.out.println("Guess a number from 1 - 10");
		int number = input.nextInt();

		if (genRand == number){
			System.out.println("Correct");
		}
		else{
			System.out.println("Wrong guess");
		}

	}
}