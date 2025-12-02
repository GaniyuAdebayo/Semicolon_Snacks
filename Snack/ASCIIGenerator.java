import java.util.Scanner;

public class ASCIIGenerator{

	public static void main (String [] args){

	Scanner input = new Scanner (System.in);

	System.out.println("Enter your character: ");
	char character = input.next().charAt(0);

	int charValue = (int) character;

	System.out.printf("The ASCII equivalent of %s is %d%n", character, charValue);
}

}