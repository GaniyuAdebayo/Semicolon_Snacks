import java.util.Scanner;

public class CreditCardMain{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter Card Number:\nXXXX-XXXX-XXXX-XXXX or XXXX XXXX XXXX XXXX ");
		String number = input.nextLine();

		System.out.printf("Credit Card Type: %s%n", CreditCard.creditCardType(number));
		System.out.printf("Credit Card Number: %s%n", CreditCard.getCardNumber(number));
		System.out.printf("Credit Card Digit Length: %d%n", CreditCard.cardTypeLength(number));
		System.out.printf("Credit Card Validity Status: %s%n", CreditCard.creditCardValidityStatus(number));
	}
}