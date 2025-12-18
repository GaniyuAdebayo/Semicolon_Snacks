import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class CreditCardTestCopy{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter Card Number:\nXXXX-XXXX-XXXX-XXXX or XXXX XXXX XXXX XXXX ");
		String number = input.nextLine();

		boolean numberOnly = Pattern.matches("^[\\d\\s-]{16,19}$", number);

		if (!numberOnly){
			throw new RuntimeException("Invalid Card Number");
		}

		String validCC = number.replaceAll("\\D+", "");

		if (validCC.length() >= 13 && validCC.length() <= 16){

			CreditCardCopy.creditCardType(validCC);
			CreditCardCopy.cardTypeLength(validCC);
			CreditCardCopy.creditCardValidityStatus(validCC);
		}

		else{

			System.out.println("Invalid Card Number!");
		}
	}
}