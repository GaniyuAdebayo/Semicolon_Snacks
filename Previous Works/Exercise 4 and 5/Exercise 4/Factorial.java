import java.util.Scanner;

public class Factorial{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a non-negative value: ");
		int number = input.nextInt();

		while (number < 0){

			System.out.println("Enter a non-negative value: ");
			number = input.nextInt();

		}
			System.out.printf("%d! is %d\n", number, factorial(number));
			System.out.printf("constant e is %.2f to %d terms\n", expoConstant(number), number);
			System.out.printf("ex is %.2f to %d terms\n", expoX(number), number);
		
	}

	public static int factorial(int number){

		int value = 1;

		for (int counter = number; counter >= 1; counter--){

			value *= counter;
		}

		return value;

	}

	public static double expoConstant(int number){

		double value = 1.0;

		for (int counter = 1; counter <= number; counter++){

			value += (double) 1/factorial(counter);
		}

		return value;
	}

	public static double expoX(int number){

		double value = 1.0;

		for (int counter = 1; counter <= number; counter++){

			value += Math.pow(number, counter) / factorial(counter);
		}
		return value;
	}
}