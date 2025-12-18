import java.util.Scanner;

public class CreditCardCopy{

	
	public static void creditCardValidityStatus(String cardNumber){

		int cardNumberLength = cardNumber.length();
		
		int evenSum = 0;
		int oddSum = 0;

		for(int counter = 1; counter <= cardNumberLength; counter++){
			int value = Character.getNumericValue(
								cardNumber.charAt(cardNumberLength - counter)
							);

			if(counter % 2 == 0){ // even index
				int calculatedValue = value * 2;

				if (calculatedValue >= 10) {
					evenSum += ((calculatedValue % 10) + (calculatedValue / 10));
				} else {
					evenSum += calculatedValue;
				}
			} else { // odd index
				oddSum += value;
			}
		}

		int total = evenSum + oddSum;

		if (total%10 == 0)
			System.out.println("Credit Card Validity Status: Valid");
		else
			System.out.println("Credit Card Validity Status: Invalid");

	}



	public static void creditCardType(String cardNumber){

		if (cardNumber.startsWith("4")) {
			System.out.println("Credit Card Type: Visa Card");
		} else if (cardNumber.startsWith("5")) {
			System.out.println("Credit Card Type: Master Card");
		} else if (cardNumber.startsWith("6")) {
			System.out.println("Credit Card Type: Discover Card");
		} else if (cardNumber.startsWith("37")) {
			System.out.println("Credit Card Type: American Express Card");
		} else {
			System.out.println("Credit Card Type: Invalid Card Type");
		}
		System.out.printf("Credit Card Number: %s%n", cardNumber);
	}

	public static void cardTypeLength(String cardNumber){

		int cardNumberLength = cardNumber.length();

		System.out.printf("Credit Card Digit Length: %d%n", cardNumberLength);
	
	}
}
