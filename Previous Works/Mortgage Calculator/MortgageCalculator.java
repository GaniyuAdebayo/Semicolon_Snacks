import java.util.Scanner;

public class MortgageCalculator{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		double principal = MortgageCalculatorMethods.principalCollection();

		while (principal <= 0){
			System.out.println("Invalid Input, put value greater than 0");
			principal = MortgageCalculatorMethods.principalCollection();}

		double rate = MortgageCalculatorMethods.rateCollection();

		while (rate <= 0.0){
			System.out.println("Invalid Input, put value greater than 0");
			rate = MortgageCalculatorMethods.rateCollection();}

		int years = MortgageCalculatorMethods.yearsCollection();

		while (years <= 0){
			System.out.println("Invalid Input, put value greater than 0");
			years = MortgageCalculatorMethods.yearsCollection();}

		
		rate = rate/(100 * 12);

		int months = years * 12;

		double monthlyPayment = principal * rate * Math.pow((1 + rate), months) * (1 / (Math.pow((1 + rate), months) - 1));

		System.out.printf("Your monthly payment is $%.2f%n", monthlyPayment);

	}

}