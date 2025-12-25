import java.util.Scanner;

public class MortgageCalculator{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter the principal amount: ");
		double principal = input.nextDouble();

		System.out.println("Enter the annual interest rate: ");
		double rate = input.nextDouble();

		rate = rate/(100 * 12);

		System.out.println("Enter the duration in years: ");
		int years = input.nextInt();

		int months = years * 12;

		double monthlyPayment = principal * rate * Math.pow((1 + rate), months) * (1 / (Math.pow((1 + rate), months) - 1));

		System.out.printf("Your monthly payment is $%.2f%n", monthlyPayment);

	}

}