import java.util.Scanner;

public class Palindrome{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a number to check for palindrome: ");
		int number = input.nextInt();

		String valNumber = String.valueOf(number);
		String reverse = "";

		if (valNumber.length() == 5){

			for (int counter = 0; counter < 5; counter++){

				reverse = String.valueOf(valNumber.charAt(counter)) + reverse;

			}
			if( valNumber == reverse)
				System.out.println("Number is a palindrome");
			else
				System.out.println("Number is not a palindrome");
	
		}

		else
			System.out.println("Number is more than 5 digit");
	}

}