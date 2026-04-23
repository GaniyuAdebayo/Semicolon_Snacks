import java.util.Scanner;

public class Greeting{

	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);

		System.out.println("Input first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Input last name: ");
		String lastName = input.nextLine();

		System.out.printf("Hello, %s %s%n", firstName, lastName);
}
}