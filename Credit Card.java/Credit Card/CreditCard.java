
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CreditCard{

	
	public static String creditCardValidityStatus(String cardNumber){

		int cardNumberLength = cardTypeLength(cardNumber);

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

		cardNumber = getCardNumber(cardNumber);

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

	public static int cardTypeLength(String cardNumber){

		cardNumber = getCardNumber(cardNumber);

		int cardNumberLength = cardNumber.length();

		return cardNumberLength;
	
	}


	public static String getCardNumber(String number){

		boolean numberOnly = Pattern.matches("^[\\d\\s-]{16,19}$", number);

		String validCC = number.replaceAll("\\D+", "");

		if (numberOnly && validCC.length() >= 13 && validCC.length() <= 16){

			return validCC;
		}

		else
			throw new RuntimeException("Invalid Card Number");


	}
}
