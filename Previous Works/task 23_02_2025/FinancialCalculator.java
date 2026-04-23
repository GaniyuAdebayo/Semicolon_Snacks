import java.util.Scanner;
public class FinancialCalculator{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.println("Enter number of years: ");
		int years = input.nextInt();

		int months = years * 12;

		System.out.printf("%-15s%-18s%-15s%n", "Interest Rate", "Monthly Payment", "Total Payment");

		for (double rate = 5.0; rate <= 10; rate += 0.25){

			double monthlyRate = rate/(100 * 12);

			double monthlyPayment = loanAmount * monthlyRate * Math.pow((1 + monthlyRate), months) * (1 / (Math.pow((1 + monthlyRate), months) - 1));
			double totalPayment = monthlyPayment * months;

			System.out.printf("%-15.2f%-18.2f%-15.2f%n", rate, monthlyPayment, totalPayment);

		}

		
	}

	

}