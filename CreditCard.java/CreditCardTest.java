import java.util.Scanner;

public class CreditCardTest{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter Card Number: ");
		String number = input.next();

		boolean numberOnly = true;
		for (int counter = 0; counter < number.length(); counter++){

			if (Character.isLetter(number.charAt(counter)) == true || Character.isWhitespace(number.charAt(counter)) == true ){
				
				numberOnly = false;
				break;
			}
		}

		if ((number.length() >= 13 && number.length() <= 16) || (numberOnly == true)){

			CreditCard.creditCardType(number);
			CreditCard.cardTypeLength(number);
			CreditCard.creditCardValidityStatus(number);
		}

		else{

			System.out.println("Invalid Card Number!");
		}
	}
}