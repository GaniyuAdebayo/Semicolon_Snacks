
public class CreditCardMain{

	public static void main (String [] args){

		String number = CreditCard.validateCardNumber();

			System.out.printf("Credit Card Type: %s%n", CreditCard.creditCardType(number));
			System.out.printf("Credit Card Number: %s%n", number);
			System.out.printf("Credit Card Digit Length: %d%n", number.length());
			System.out.printf("Credit Card Validity Status: %s%n", CreditCard.creditCardValidityStatus(number));

		
	}
}