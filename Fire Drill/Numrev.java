import java.util.Scanner;

public class Numrev {

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int firstDigit = number / 100;

		int secondDigit = (number % 100)/10;

		int thirdDigit = (number % 100) % 10;


		System.out.printf("Reversed number of %d is %d%d%d%n", number, thirdDigit, secondDigit, firstDigit);



}
}