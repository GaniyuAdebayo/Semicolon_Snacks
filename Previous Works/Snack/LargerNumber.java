

import java.util.Scanner;

public class LargerNumber{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Input first number: ");
		int firstNumber = input.nextInt();

		System.out.println("Input second number: ");
		int secondNumber = input.nextInt();

		if (firstNumber > secondNumber){

			System.out.printf("%d is greater than %d%n", firstNumber, secondNumber);
}
		else{
			System.out.printf("%d is greater than %d%n", secondNumber, firstNumber);
}


}
}