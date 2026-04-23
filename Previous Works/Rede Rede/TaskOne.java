import java.security.SecureRandom;
public class TaskOne{

	public static void main (){

		SecureRandom randomNumber = new SecureRandom();

		int genRand = 1 + randomNumber.nextInt(10);

		System.out.printf("The generated random number is %d", genRand);
	}
}