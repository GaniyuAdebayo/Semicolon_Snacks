import java.util.Scanner;

public class BinaryToDecimal{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter your binary number (0 & 1 only): ");
		int number = input.nextInt();
		int decimalNumber = number;
		
		int count = 0;
		int decimal = 0;
		while (number != 0){

			decimal += (number % 10) * Math.pow(2, count);

			number /= 10;

			count++;

		}

		System.out.printf("Decimal conversion of %d in base 2 is %d%n", decimalNumber, decimal);
	}

}