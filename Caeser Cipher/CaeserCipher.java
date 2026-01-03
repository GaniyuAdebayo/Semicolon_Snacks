import java.util.Scanner;
public class CaeserCipher{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter the password to be encrypted: ");
		String realPassword = input.nextLine();

		System.out.println("Enter the difference in encryption: ");
		int difference = input.nextInt();

		System.out.printf("The encrypted password is %s%n", passwordEncrytion(realPassword, difference));

	}

	public static String passwordEncrytion(String password, int difference){

		String encryptedPassword = "";

		for (int counter = 0; counter < password.length(); counter++){

			int intValue = password.charAt(counter) + difference;

			if (intValue > (int) 'Z' && Character.isUpperCase((char) password.charAt(counter))){

				intValue = intValue % (int) 'Z' + (int) 'A' - 1;
			}

			else if (intValue > (int) 'z' && Character.isLowerCase((char) password.charAt(counter))){

				intValue = intValue % (int) 'z' + (int) 'a' - 1;
			}

			else{

				intValue = intValue;

			}

			encryptedPassword = encryptedPassword + (char) intValue;

		}

		return encryptedPassword;
	}

}