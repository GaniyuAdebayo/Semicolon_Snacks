import java.util.Scanner;

public class IntegerOperations{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Input first integer: ");
		int firstInteger = input.nextInt();

		System.out.println("Input second integer: ");
		int secondInteger = input.nextInt();

		System.out.println("Input third integer: ");
		int thirdInteger = input.nextInt();

		int sumOfIntegers = firstInteger + secondInteger + thirdInteger;

		double integersAverage = (double) sumOfIntegers/3;

		System.out.printf("The sum of %d, %d, and %d is %d, while its average is %.2f%n", firstInteger, secondInteger, thirdInteger, sumOfIntegers, integersAverage);


}

}