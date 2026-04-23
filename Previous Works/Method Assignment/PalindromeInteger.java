import java.util.Scanner;

public class PalindromeInteger{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		isPalindrome(number);

	}

	public static int reverse (int number){

		String stringNumber = String.valueOf(number);

		String reverseNumber = "";

		for (int counter = 0; counter < stringNumber.length(); counter++){
			
			reverseNumber = String.valueOf(stringNumber.charAt(counter)) + reverseNumber;
		}

		return Integer.valueOf(reverseNumber);

	}

	public static void isPalindrome (int number){

		if (number == reverse(number))

			System.out.printf("%d is a palindrome%n", number);
		else
			System.out.printf("%d is not a palindrome%n", number);
	}

}