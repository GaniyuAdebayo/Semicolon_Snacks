
import java.util.regex.Pattern;
import java.util.Scanner;

public class CreditCard{

	private static Scanner input = new Scanner (System.in);

	
	public static String creditCardValidityStatus(String cardNumber){

		int cardNumberLength = cardNumber.length();

		String status = "";
		
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
			status = "Valid";
		else
			status = "Invalid";

		return status;

	}



	public static String creditCardType(String cardNumber){

		String cardType = "";

		if (cardNumber.startsWith("4")) {
			cardType = "Visa Card";
		} else if (cardNumber.startsWith("5")) {
			cardType = "Master Card";
		} else if (cardNumber.startsWith("6")) {
			cardType = "Discover Card";
		} else if (cardNumber.startsWith("37")) {
			cardType = "Express Card";
		} else {
			cardType = "Invalid Card Type";
		}

		return cardType;
	}


	public static String validateCardNumber(){

		System.out.println("Enter Card Number:\nXXXX-XXXX-XXXX-XXXX or XXXX XXXX XXXX XXXX ");

		String number = input.nextLine();

		boolean numberOnly = Pattern.matches("^[\\d\\s-]{13,19}$", number);

		String cardNumber = number.replaceAll("\\D+", "");

		if (numberOnly && cardNumber.length() >= 13 && cardNumber.length() <= 16){

			return cardNumber;
		}

		else{
				System.out.println("Invalid card number");
				return validateCardNumber();
			
		}
			

	}

}
