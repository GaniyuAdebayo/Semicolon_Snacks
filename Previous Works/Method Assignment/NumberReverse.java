
import java.util.Scanner;
public class NumberReverse{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);
		int number = input.nextInt();

		reverse(number);

	}

	public static void reverse (int number){

		String stringNumber = String.valueOf(number);

		String reverseNumber = "";

		for (int counter = 0; counter < stringNumber.length(); counter++){
			
			reverseNumber = String.valueOf(stringNumber.charAt(counter)) + reverseNumber;
		}

		System.out.printf("Reverse of %d is %s%n", number, reverseNumber);

	}

}